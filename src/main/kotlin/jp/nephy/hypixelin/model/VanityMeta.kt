package jp.nephy.hypixelin.model

import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class VanityMeta(val json: JsonElement) {
    val packages by json.byList<String>()
}
