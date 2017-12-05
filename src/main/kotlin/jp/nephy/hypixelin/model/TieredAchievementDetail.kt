package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byString
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class TieredAchievementDetail(val json: JsonElement) {
    val name by json.byString
    val description by json.byString
    val tiers by json.byList<Tier>()
}
