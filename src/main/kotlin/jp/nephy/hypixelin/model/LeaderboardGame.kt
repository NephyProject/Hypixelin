package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byInt
import com.github.salomonbrys.kotson.byString
import com.github.salomonbrys.kotson.get
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byLambda
import jp.nephy.hypixelin.converter.byList
import jp.nephy.hypixelin.toTriple

class LeaderboardGame(val json: JsonElement) {
    val count by json.byInt
    val leaders by json.byList<String>()
    val location by json.byLambda { asString.split(",").map { it.toInt() }.toTriple() }
    val path by json.byString
    val prefix by json.byString
    val title by json.byString
}
