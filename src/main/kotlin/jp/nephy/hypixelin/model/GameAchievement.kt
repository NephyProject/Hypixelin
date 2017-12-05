package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byInt
import com.github.salomonbrys.kotson.toMap
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byLambda

class GameAchievement(val json: JsonElement) {
    val oneTime by json.byLambda("one_time") { asJsonObject.toMap().map { it.key to AchievementDetail(it.value, it.key) }.toMap() }
    val totalPoints by json.byInt("total_points")
    val tiered by json.byLambda { asJsonObject.toMap().map { it.key to TieredAchievementDetail(it.value) } }
}
