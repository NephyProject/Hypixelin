package jp.nephy.hypixelin.response

import com.github.salomonbrys.kotson.byBool
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byModel
import jp.nephy.hypixelin.model.HypixelSession

class GetSession(val json: JsonElement) {
    val success by json.byBool
    val session by json.byModel<HypixelSession>()
}
