package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableInt
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class BlitzSurvivalGames(val json: JsonElement) {
    val coins by json.byNullableInt
    val deaths by json.byNullableInt
    val kills by json.byNullableInt
    val monthlyKillsB by json.byNullableInt("monthly_kills_b")
    val packages by json.byList<String>()
    val weeklyKillsA by json.byNullableInt("weekly_kills_a")
    val weeklyKillsB by json.byNullableInt("weekly_kills_b")
}
