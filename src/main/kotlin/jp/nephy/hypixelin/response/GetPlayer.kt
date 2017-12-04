package jp.nephy.hypixelin.response

import com.github.salomonbrys.kotson.byBool
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byModel
import jp.nephy.hypixelin.model.Player

class GetPlayer(val json: JsonElement) {
    val success by json.byBool
    val player by json.byModel<Player>()
}
