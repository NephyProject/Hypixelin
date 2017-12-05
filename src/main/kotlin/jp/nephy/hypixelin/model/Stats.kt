package jp.nephy.hypixelin.model

import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byModel
import jp.nephy.hypixelin.model.stats.*

class Stats(val json: JsonElement) {
    val Arcade by json.byModel<Arcade>()
    val Arena by json.byModel<Arena>()
    val Warlords by json.byModel<Warlords>()
    val Bedwars by json.byModel<BedWars>()
    val TurboKartRacers by json.byModel<TurboKartRacers>()
    val BlitzSurvivalGames by json.byModel<BlitzSurvivalGames>()
    val ClassicGames by json.byModel<ClassicGames>()
    val CopsAndCrims by json.byModel<CopsAndCrims>()
    val MurderMystery by json.byModel<MurderMystery>()
    val Paintball by json.byModel<Paintball>()
    val Quake by json.byModel<Quake>()
    val SkyClash by json.byModel<SkyClash>()
    val SkyWars by json.byModel<SkyWars>()
    val SpeedUHC by json.byModel<SpeedUHC>()
    val SmashHeroes by json.byModel<SmashHeroes>()
    val TNTGames by json.byModel<TNTGames>()
    val CrazyWalls by json.byModel<CrazyWalls>()
    val UHCChampions by json.byModel<UHCChampions>()
    val VampireZ by json.byModel<VampireZ>()
    val Walls by json.byModel<Walls>()
    val MegaWalls by json.byModel<MegaWalls>()
}
