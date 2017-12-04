package jp.nephy.hypixelin

import com.github.salomonbrys.kotson.contains
import com.google.gson.*
import okhttp3.Request
import okhttp3.Response
import java.lang.reflect.InvocationTargetException

class HypixelinResponse(val request: Request, val response: Response) {
    private var content: String? = null

    fun getContent(): String {
        if (content == null) {
            content = (response.body()?.string() ?: "").unescapeHTMLCharacters()
        }
        return content!!
    }

    fun getJsonObject(content: String) = try {
        Gson().fromJson(content, JsonObject::class.java)
    } catch (e: JsonSyntaxException) {
        e.printStackTrace()
        throw IllegalStateException("Invalid Json format returned. ($content)")
    }

    inline fun <reified T> getResponseObject(): ResponseObject<T> {
        val content = getContent()

        val jsonObject = getJsonObject(content)
        if (jsonObject.contains("cause")) {
            throw IllegalStateException(jsonObject["cause"].asString)
        }
        if (jsonObject.contains("success") && ! jsonObject["success"].asBoolean) {
            throw IllegalStateException("Request failed.")
        }

        val result = try {
            T::class.java.getConstructor(JsonElement::class.java).newInstance(jsonObject)
        } catch (e: NullPointerException) {
            e.printStackTrace()
            throw IllegalStateException("Json is not matched with ${T::class.java.simpleName} Class. ($content)")
        } catch (e: InvocationTargetException) {
            e.printStackTrace()
            throw IllegalStateException("Json is null. Use Empty class instead of ${T::class.java.simpleName}. ($content)")
        }

        return ResponseObject(result, content, request, response)
    }
}
