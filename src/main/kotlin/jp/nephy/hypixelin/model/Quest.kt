package jp.nephy.hypixelin.model

import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList
import jp.nephy.hypixelin.converter.byModel

class Quest(val json: JsonElement) {
    val active by json.byModel<QuestActive?>()
    val completions by json.byList<QuestCompletion>()
}
