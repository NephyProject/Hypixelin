package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byInt
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class GiftingMeta(val json: JsonElement) {
    val giftsGiven by json.byInt
    val bundlesGiven by json.byInt
    val realBundlesGiven by json.byInt
    val milestones by json.byList<String>()
}
