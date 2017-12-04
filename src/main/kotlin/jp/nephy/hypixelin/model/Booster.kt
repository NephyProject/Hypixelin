package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byFloat
import com.github.salomonbrys.kotson.byInt
import com.github.salomonbrys.kotson.byLong
import com.github.salomonbrys.kotson.byString
import com.google.gson.JsonElement

class Booster(val json: JsonElement) {
    val id by json.byString("_id")
    val amount by json.byFloat
    val dateActivated by json.byLong
    val gameType by json.byInt
    val length by json.byInt
    val originalLength by json.byInt
    val purchaserUuid by json.byString
}
