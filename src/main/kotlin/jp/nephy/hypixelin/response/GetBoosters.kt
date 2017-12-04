package jp.nephy.hypixelin.response

import com.github.salomonbrys.kotson.byBool
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList
import jp.nephy.hypixelin.model.Booster

class GetBoosters(val json: JsonElement) {
    val success by json.byBool
    val boosters by json.byList<Booster>()
}
