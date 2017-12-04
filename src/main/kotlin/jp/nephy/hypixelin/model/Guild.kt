package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byBool
import com.github.salomonbrys.kotson.byInt
import com.github.salomonbrys.kotson.byLong
import com.github.salomonbrys.kotson.byString
import com.google.gson.JsonElement

class Guild(val json: JsonElement) {
    val id by json.byString("_id")
    val bankSizeLevel by json.byInt
    val banner by json.byNullableObject
    val canParty by json.byBool
    val canTag by json.byBool
    val coins by json.byInt
    val coinsEver by json.byInt
    val created by json.byLong
    val dailyCoins-1-11-2017 by json.byNullableInt
    val dailyCoins-2-11-2017 by json.byNullableInt
    val dailyCoins-26-10-2017 by json.byNullableInt
    val dailyCoins-3-11-2017 by json.byNullableInt
    val memberSizeLevel by json.byInt
    val members by json.byNullableArray
    val mvpCount by json.byInt
    val name by json.byString
    val tag by json.byString
    val vipCount by json.byInt
}
