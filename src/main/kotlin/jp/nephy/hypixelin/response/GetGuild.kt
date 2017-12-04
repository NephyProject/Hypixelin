package jp.nephy.hypixelin.response

import com.github.salomonbrys.kotson.byBool
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byModel
import jp.nephy.hypixelin.model.Guild

class GetGuild(val json: JsonElement) {
    val success by json.byBool
    val guild by json.byModel<Guild>()
}
