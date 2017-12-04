package jp.nephy.hypixelin.response

import com.github.salomonbrys.kotson.byBool
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList
import jp.nephy.hypixelin.model.Friend

class GetFriends(val json: JsonElement) {
    val success by json.byBool
    val friends by json.byList<Friend>()
}
