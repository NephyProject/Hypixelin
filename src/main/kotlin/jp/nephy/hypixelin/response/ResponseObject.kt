package jp.nephy.hypixelin.response

import okhttp3.Request
import okhttp3.Response

@Suppress("UNUSED")
class ResponseObject<out T>(val result: T, val content: String, val request: Request, val response: Response) {
    val headers: Map<String, List<String>> = response.headers().toMultimap()

    fun print() {
        println(request.toString())
        println(request.headers())
        println()
        println(response.toString())
        println(response.headers())
        println(content)
        println()
    }
}
