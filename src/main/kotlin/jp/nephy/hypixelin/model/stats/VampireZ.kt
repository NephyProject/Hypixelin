package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableBool
import com.github.salomonbrys.kotson.byNullableInt
import com.google.gson.JsonElement

class VampireZ(val json: JsonElement) {
    val coins by json.byNullableInt
    val humanDeaths by json.byNullableInt("human_deaths")
    val updatedStats by json.byNullableBool("updated_stats")
    val vampireDeaths by json.byNullableInt("vampire_deaths")
    val vampireKills by json.byNullableInt("vampire_kills")
    val zombieKills by json.byNullableInt("zombie_kills")
}
