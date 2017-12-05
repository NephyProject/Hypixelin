package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableInt
import com.google.gson.JsonElement

class Walls(val json: JsonElement) {
    val coins by json.byNullableInt
    val deaths by json.byNullableInt
    val kills by json.byNullableInt
    val losses by json.byNullableInt
    val monthlyKillsB by json.byNullableInt("monthly_kills_b")
    val weeklyKillsA by json.byNullableInt("weekly_kills_a")
}
