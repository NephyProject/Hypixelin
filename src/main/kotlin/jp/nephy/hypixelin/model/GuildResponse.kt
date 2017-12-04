package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byBool
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byModel

class GuildResponse(val json: JsonElement) {
    val success by json.byBool
    val guild by json.byModel<Guild>()
}
