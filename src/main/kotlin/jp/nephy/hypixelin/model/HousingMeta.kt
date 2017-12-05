package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byString
import com.github.salomonbrys.kotson.get
import com.github.salomonbrys.kotson.toMap
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byLambda
import jp.nephy.hypixelin.converter.byList

class HousingMeta(val json: JsonElement) {
    val packages by json.byList<String>()
    val tutorialStep by json.byString
    val allowedBlocks by json.byList<String>()
    val playerSettings by json.byLambda { asJsonObject.toMap().map { it.key to it.value.asString }.toMap() }
}
