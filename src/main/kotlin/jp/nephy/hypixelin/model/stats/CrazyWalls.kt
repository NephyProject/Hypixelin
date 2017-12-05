package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableInt
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class CrazyWalls(val json: JsonElement) {
    val coins by json.byNullableInt
    val packages by json.byList<String>()
}
