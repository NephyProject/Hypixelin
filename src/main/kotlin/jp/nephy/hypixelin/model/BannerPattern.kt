package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byString
import com.github.salomonbrys.kotson.get
import com.google.gson.JsonElement

class BannerPattern(val json: JsonElement) {
    val pattern by json.byString("Pattern")
    val color = if (json["Color"].asJsonPrimitive.isString) {
        json["Color"].asString
    } else {
        json["Color"].asInt.toString()
    }
}
