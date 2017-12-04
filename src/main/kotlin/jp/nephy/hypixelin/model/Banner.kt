package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byString
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class Banner(val json: JsonElement) {
    val base by json.byString("Base")
    val patterns by json.byList<BannerPattern>("Patterns")
}
