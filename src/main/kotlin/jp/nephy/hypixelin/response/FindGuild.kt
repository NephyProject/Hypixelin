package jp.nephy.hypixelin.response

import com.github.salomonbrys.kotson.byBool
import com.github.salomonbrys.kotson.byNullableString
import com.google.gson.JsonElement

class FindGuild(val json: JsonElement) {
    val success by json.byBool
    val guildId by json.byNullableString("guild")
}
