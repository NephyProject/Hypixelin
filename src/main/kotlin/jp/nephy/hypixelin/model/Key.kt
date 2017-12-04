package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byInt
import com.github.salomonbrys.kotson.byLong
import com.github.salomonbrys.kotson.byString
import com.google.gson.JsonElement

class Key(val json: JsonElement) {
    val key by json.byString
    val ownerUuid by json.byString
    val queriesInPastMin by json.byInt
    val totalQueries by json.byLong
}
