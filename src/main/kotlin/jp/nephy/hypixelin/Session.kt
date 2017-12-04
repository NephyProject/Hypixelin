package jp.nephy.hypixelin

import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import okhttp3.Protocol
import java.util.concurrent.TimeUnit

class Session(val apiKey: String, connectTimeoutSec: Int?=null, readTimeoutSec: Int?=null, writeTimeoutSec: Int?=null) {
    val httpClient = OkHttpClient.Builder()
            .connectTimeout(connectTimeoutSec?.toLong() ?: 20, TimeUnit.SECONDS)
            .readTimeout(readTimeoutSec?.toLong() ?: 40, TimeUnit.SECONDS)
            .writeTimeout(writeTimeoutSec?.toLong() ?: 20, TimeUnit.SECONDS)
            .protocols(listOf(Protocol.HTTP_1_1, Protocol.HTTP_2))
            .connectionPool(ConnectionPool(10, 400, TimeUnit.SECONDS))
            .build()!!

    fun new() = HypixelinRequest(this)
}
