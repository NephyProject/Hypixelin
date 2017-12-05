package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableInt
import com.google.gson.JsonElement

class ClassicGames(val json: JsonElement) {
    val coins by json.byNullableInt
    val gingerbreadTokens by json.byNullableInt("gingerbread_tokens")
    val nextTokensSeconds by json.byNullableInt("next_tokens_seconds")
    val paintballTokens by json.byNullableInt("paintball_tokens")
    val quakecraftTokens by json.byNullableInt("quakecraft_tokens")
    val tokens by json.byNullableInt
    val totalTokens by json.byNullableInt("total_tokens")
    val vampirezTokens by json.byNullableInt("vampirez_tokens")
}
