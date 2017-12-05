package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byInt
import com.github.salomonbrys.kotson.byString
import com.google.gson.JsonElement

class AchievementDetail(val json: JsonElement, private val game: String) {
    val points by json.byInt
    val name by json.byString
    val description by json.byString

    fun getAchievementKey(): String {
        return "${game}_$name".toLowerCase()
    }
}
