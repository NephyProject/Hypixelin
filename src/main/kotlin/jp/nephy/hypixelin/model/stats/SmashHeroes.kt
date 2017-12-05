package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableFloat
import com.github.salomonbrys.kotson.byNullableInt
import com.github.salomonbrys.kotson.byNullableObject
import com.google.gson.JsonElement

class SmashHeroes(val json: JsonElement) {
    val classStats by json.byNullableObject("class_stats")
    val coins by json.byNullableInt
    val damageDealt by json.byNullableInt("damage_dealt")
    val damageDealt2V2 by json.byNullableInt("damage_dealt_2v2")
    val deaths by json.byNullableInt
    val deaths2V2 by json.byNullableInt("deaths_2v2")
    val games by json.byNullableInt
    val games2V2 by json.byNullableInt("games_2v2")
    val gamesMonthlyB by json.byNullableInt("games_monthly_b")
    val gamesWeeklyB by json.byNullableInt("games_weekly_b")
    val kills by json.byNullableInt
    val kills2V2 by json.byNullableInt("kills_2v2")
    val killsMonthlyB by json.byNullableInt("kills_monthly_b")
    val killsWeeklyB by json.byNullableInt("kills_weekly_b")
    val lastLevelTheBulk by json.byNullableInt("lastLevel_THE_BULK")
    val losses by json.byNullableInt
    val losses2V2 by json.byNullableInt("losses_2v2")
    val lossesMonthlyB by json.byNullableInt("losses_monthly_b")
    val lossesWeeklyB by json.byNullableInt("losses_weekly_b")
    val smashLevel by json.byNullableInt
    val smashLevelTotal by json.byNullableInt("smash_level_total")
    val smashed by json.byNullableInt
    val smashed2V2 by json.byNullableInt("smashed_2v2")
    val smasher by json.byNullableInt
    val smasher2V2 by json.byNullableInt("smasher_2v2")
    val winStreak by json.byNullableInt("win_streak")
    val wins by json.byNullableInt
    val wins2V2 by json.byNullableInt("wins_2v2")
    val winsMonthlyB by json.byNullableInt("wins_monthly_b")
    val winsWeeklyB by json.byNullableInt("wins_weekly_b")
    val xpTheBulk by json.byNullableFloat("xp_THE_BULK")
}
