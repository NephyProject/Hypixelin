package jp.nephy.hypixelin

import java.net.URLEncoder

internal fun String.toURLEncode(): String {
    val encoded = URLEncoder.encode(this, "UTF-8")
    return StringBuilder(encoded.length).apply {
        for (c in encoded) {
            append(when (c) {
                '+' -> "%20"
                '*' -> "%2A"
                else -> c
            })
        }
    }.toString()
}

internal fun String.unescapeHTMLCharacters() = this
    .replace("&amp;", "&")
    .replace("&lt;", "<")
    .replace("&gt;", ">")

internal fun List<Int>.toTriple(): Triple<Int, Int, Int> {
    return Triple(this.component1(), this.component2(), this.component3())
}
