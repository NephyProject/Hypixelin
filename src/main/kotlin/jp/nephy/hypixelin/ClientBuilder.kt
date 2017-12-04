package jp.nephy.hypixelin

class ClientBuilder {
    private var apiKey: String? = null

    private var connectTimeout: Int? = null
    private var readTimeout: Int? = null
    private var writeTimeout: Int? = null

    @Suppress("UNUSED")
    fun key(apiKey: String) = this.apply {
        this@ClientBuilder.apiKey = apiKey
    }

    @Suppress("UNUSED")
    fun connectTimeout(sec: Int) = this.apply {
        connectTimeout = sec
    }
    @Suppress("UNUSED")
    fun readTimeout(sec: Int) = this.apply {
        readTimeout = sec
    }
    @Suppress("UNUSED")
    fun writeTimeout(sec: Int) = this.apply {
        writeTimeout = sec
    }

    fun build(): Client {
        if (apiKey == null) {
            throw NullPointerException("apiKey is non-null parameter.")
        }

        val session = Session(apiKey!!, connectTimeout, readTimeout, writeTimeout)

        return Client(session)
    }
}
