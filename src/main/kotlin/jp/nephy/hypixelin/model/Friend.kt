package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byLong
import com.github.salomonbrys.kotson.byString
import com.google.gson.JsonElement

class Friend(val json: JsonElement) {
    val id by json.byString("_id")
    val started by json.byLong
    val uuidReceiver by json.byString
    val uuidSender by json.byString
}
