package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableBool
import com.github.salomonbrys.kotson.byNullableInt
import com.github.salomonbrys.kotson.byNullableString
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class Quake(val json: JsonElement) {
    val alternativeGunCooldownIndicator by json.byNullableBool("alternative_gun_cooldown_indicator")
    val armor by json.byNullableString
    val coins by json.byNullableInt
    val compassSelected by json.byNullableBool("compass_selected")
    val deaths by json.byNullableInt
    val deathsTeams by json.byNullableInt("deaths_teams")
    val distanceTravelled by json.byNullableInt("distance_travelled")
    val distanceTravelledTeams by json.byNullableInt("distance_travelled_teams")
    val enableSound by json.byNullableBool("enable_sound")
    val headshots by json.byNullableInt
    val highestKillstreak by json.byNullableInt("highest_killstreak")
    val instantRespawn by json.byNullableBool
    val kills by json.byNullableInt
    val killsSinceUpdateFeb2017 by json.byNullableInt("kills_since_update_feb_2017")
    val killsSinceUpdateFeb2017Teams by json.byNullableInt("kills_since_update_feb_2017_teams")
    val killsTeams by json.byNullableInt("kills_teams")
    val killstreaksTeams by json.byNullableInt("killstreaks_teams")
    val monthlyKillsA by json.byNullableInt("monthly_kills_a")
    val monthlyKillsB by json.byNullableInt("monthly_kills_b")
    val packages by json.byList<String>()
    val shotsFired by json.byNullableInt("shots_fired")
    val shotsFiredTeams by json.byNullableInt("shots_fired_teams")
    val weeklyKillsA by json.byNullableInt("weekly_kills_a")
    val weeklyKillsB by json.byNullableInt("weekly_kills_b")
    val winsTeams by json.byNullableInt("wins_teams")
}
