package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableInt
import com.github.salomonbrys.kotson.byNullableString
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class MegaWalls(val json: JsonElement) {
    val assists by json.byNullableInt
    val assistsCreeper by json.byNullableInt("assists_Creeper")
    val chosenClass by json.byNullableString("chosen_class")
    val coins by json.byNullableInt
    val deaths by json.byNullableInt
    val deathsCreeper by json.byNullableInt("deaths_Creeper")
    val finalDeaths by json.byNullableInt
    val losses by json.byNullableInt
    val lossesCreeper by json.byNullableInt("losses_Creeper")
    val lossesFaceOff by json.byNullableInt("losses_face_off")
    val lossesFaceOffCreeper by json.byNullableInt("losses_face_off_Creeper")
    val packages by json.byList<String>()
    val playsFaceOff by json.byNullableInt("plays_face_off")
    val weeklyDeaths by json.byNullableInt
    val weeklyDeathsCreeper by json.byNullableInt("weeklyDeaths_Creeper")
    val weeklyLosses by json.byNullableInt
    val weeklyLossesCreeper by json.byNullableInt("weeklyLosses_Creeper")
    val weeklyLossesFaceOff by json.byNullableInt("weeklyLosses_face_off")
    val weeklyLossesFaceOffCreeper by json.byNullableInt("weeklyLosses_face_off_Creeper")
}
