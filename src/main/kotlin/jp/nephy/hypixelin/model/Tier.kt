package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byInt
import com.google.gson.JsonElement

class Tier(val json: JsonElement) {
    val tier by json.byInt
    val points by json.byInt
    val amount by json.byInt
}
