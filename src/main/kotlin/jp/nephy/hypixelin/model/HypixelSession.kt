package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byNullableString
import com.github.salomonbrys.kotson.byString
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class HypixelSession(val json: JsonElement) {
    val id by json.byString("_id")
    val server by json.byString
    val players by json.byList<String>()
    val gameType by json.byNullableString
}
