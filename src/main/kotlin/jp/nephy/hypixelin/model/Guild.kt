package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.*
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList
import jp.nephy.hypixelin.converter.byModel
import java.util.*

class Guild(val json: JsonElement) {
    val id by json.byString("_id")
    val bankSizeLevel by json.byInt
    val banner by json.byModel<Banner>()
    val canParty by json.byBool
    val canTag by json.byBool
    val coins by json.byInt
    val coinsEver by json.byInt
    val created by json.byLong
    val memberSizeLevel by json.byInt
    val members by json.byList<GuildMember>()
    val mvpCount by json.byInt
    val name by json.byString
    val tag by json.byString
    val vipCount by json.byInt

    private fun dailyCoins(year: Int, month: Int, day: Int): Int? {
        val key = "dailyCoins-$day-$month-$year"
        return if (json.asJsonObject.contains(key)) {
            json[key].asInt
        } else {
            null
        }
    }

    fun dailyCoins(calendar: Calendar): Int? {
        return dailyCoins(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE))
    }
}
