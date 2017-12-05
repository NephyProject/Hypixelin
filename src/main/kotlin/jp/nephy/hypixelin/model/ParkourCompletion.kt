package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byInt
import com.github.salomonbrys.kotson.byLong
import com.google.gson.JsonElement

class ParkourCompletion(val json: JsonElement) {
    val timeStart by json.byLong
    val timeTook by json.byInt
}
