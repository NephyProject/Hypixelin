package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byLong
import com.github.salomonbrys.kotson.byString
import com.github.salomonbrys.kotson.contains
import com.github.salomonbrys.kotson.get
import com.google.gson.JsonElement
import jp.nephy.hypixelin.enum.GuildMemberRank
import java.util.*

class GuildMember(val json: JsonElement) {
    val uuid by json.byString
    val rank = GuildMemberRank.valueOf(json["rank"].asString)
    val joined by json.byLong

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
