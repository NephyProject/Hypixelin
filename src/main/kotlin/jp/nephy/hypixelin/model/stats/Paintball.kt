package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableInt
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class Paintball(val json: JsonElement) {
    val coins by json.byNullableInt
    val deaths by json.byNullableInt
    val kills by json.byNullableInt
    val killstreaks by json.byNullableInt
    val packages by json.byList<String>()
    val shotsFired by json.byNullableInt("shots_fired")
    val wins by json.byNullableInt
}
