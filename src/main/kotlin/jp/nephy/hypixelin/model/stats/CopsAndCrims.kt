package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableInt
import com.github.salomonbrys.kotson.byNullableObject
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class CopsAndCrims(val json: JsonElement) {
    val bombsDefused by json.byNullableInt("bombs_defused")
    val bombsPlanted by json.byNullableInt("bombs_planted")
    val coins by json.byNullableInt
    val criminalKillsDeathmatch by json.byNullableInt("criminal_kills_deathmatch")
    val deaths by json.byNullableInt
    val deathsDeathmatch by json.byNullableInt("deaths_deathmatch")
    val gameWins by json.byNullableInt("game_wins")
    val gameWinsDeathmatch by json.byNullableInt("game_wins_deathmatch")
    val headshotKills by json.byNullableInt("headshot_kills")
    val kills by json.byNullableInt
    val killsDeathmatch by json.byNullableInt("kills_deathmatch")
    val mcgo by json.byNullableObject
    val monthlyKillsB by json.byNullableInt("monthly_kills_b")
    val packages by json.byList<String>()
    val shotsFired by json.byNullableInt("shots_fired")
    val weeklyKillsA by json.byNullableInt("weekly_kills_a")
}
