package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byBool
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class FriendsResponse(val json: JsonElement) {
    val success by json.byBool
    val friends by json.byList<Friend>()
}
