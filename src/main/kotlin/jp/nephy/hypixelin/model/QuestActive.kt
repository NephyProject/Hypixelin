package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byLong
import com.github.salomonbrys.kotson.toMap
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byLambda

class QuestActive(val json: JsonElement) {
    val started by json.byLong
    val objectives by json.byLambda { asJsonObject.toMap().map { it.key to it.value.asInt }.toMap() }
}
