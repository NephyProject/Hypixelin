package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableBool
import com.github.salomonbrys.kotson.byNullableInt
import com.google.gson.JsonElement

class UHCChampions(val json: JsonElement) {
    val clearupAchievement by json.byNullableBool("clearup_achievement")
    val coins by json.byNullableInt
}
