package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byString
import com.google.gson.JsonElement

class MojangUUID(val json: JsonElement) {
    val name by json.byString
    val id by json.byString
}
