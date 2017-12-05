package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.byInt
import com.github.salomonbrys.kotson.byNullableInt
import com.github.salomonbrys.kotson.byNullableLong
import com.google.gson.JsonElement

class Voting(val json: JsonElement) {
    val lastMcf by json.byNullableLong("last_mcf")
    val lastMcmp by json.byNullableLong("last_mcmp")
    val lastMcsl by json.byNullableLong("last_mcsl")
    val lastMcsorg by json.byNullableLong("last_mcsorg")
    val lastVote by json.byNullableLong("last_vote")
    val secondaryMcf by json.byNullableInt("secondary_mcf")
    val secondaryMcmp by json.byNullableInt("secondary_mcmp")
    val secondaryMcsl by json.byNullableInt("secondary_mcsl")
    val secondaryMcsorg by json.byNullableInt("secondary_mcsorg")
    val total by json.byInt
    val totalMcf by json.byNullableInt("total_mcf")
    val totalMcmp by json.byNullableInt("total_mcmp")
    val totalMcsl by json.byNullableInt("total_mcsl")
    val totalMcsorg by json.byNullableInt("total_mcsorg")
    val votesToday by json.byNullableInt
}
