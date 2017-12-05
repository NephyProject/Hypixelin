package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byLong
import com.google.gson.JsonElement

class QuestCompletion(val json: JsonElement) {
    val time by json.byLong
}
