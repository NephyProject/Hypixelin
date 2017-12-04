package jp.nephy.hypixelin

import okhttp3.Request
import java.net.ConnectException

class HypixelinRequest(private val session: Session) {
    private val builder = Request.Builder()
    private val baseUrl = "https://api.hypixel.net"
    private var url: String? = null
    private val params = linkedMapOf(
            "key" to session.apiKey
    )
    private val headers = mapOf(
            "Endpoint-Agent" to "Hypixelin/1.0 (https://github.com/NephyProject/Hypixelin)"
    )

    fun url(url: String) = this.apply {
        this.url = if (url.startsWith("/")) {
            "$baseUrl$url"
        } else {
            url
        }
    }

    fun param(param: Pair<String, String>) = this.apply {
        params.put(param.first, param.second)
    }

    fun params(vararg params: Pair<String, String>) = this.apply {
        params.forEach {
            param(it)
        }
    }

    private fun expandParameters(params: Map<String, String>): String {
        return params.map { "${it.key.toURLEncode()}=${it.value.toURLEncode()}" }.joinToString("&")
    }

    fun get() = this.apply {
        builder.get()
        headers.forEach { builder.addHeader(it.key, it.value) }
    }.execute()

    private fun execute(): HypixelinResponse {
        var requestUrl = url
        if (params.isNotEmpty()) {
            requestUrl += "?${expandParameters(params)}"
        }
        if (requestUrl == null) {
            throw IllegalStateException("url must be non-null.")
        }

        val request = builder.url(requestUrl).build()

        for (i in 0 .. 3) {
            try {
                return HypixelinResponse(request, session.httpClient.newCall(request).execute())

            } catch (e: ConnectException) {
                println("Connection failed. Try again in 3 secs.")
                e.printStackTrace()
                Thread.sleep(3000)
            }
        }

        throw ConnectException("Failed to connect to $url")
    }
}
