package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableInt
import com.google.gson.JsonElement

class Arena(val json: JsonElement) {
    val coins by json.byNullableInt
}
