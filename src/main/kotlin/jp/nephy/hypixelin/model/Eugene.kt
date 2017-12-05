package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byLong
import com.google.gson.JsonElement

class Eugene(val json: JsonElement) {
    val dailyTwoKExp by json.byLong
}
