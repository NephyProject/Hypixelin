package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.get
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byModel

class Achievements(val json: JsonElement) {
    val Warlords by json["achievements"].byModel<GameAchievement>("warlords")
    val Housing by json["achievements"].byModel<GameAchievement>("housing")
    val TNTGames by json["achievements"].byModel<GameAchievement>("tntgames")
    val Paintball by json["achievements"].byModel<GameAchievement>("paintball")
    val Arena by json["achievements"].byModel<GameAchievement>("arena")
    val Arcade by json["achievements"].byModel<GameAchievement>("arcade")
    val Christmas2017 by json["achievements"].byModel<GameAchievement>("christmas2017")
    val MurderMystery by json["achievements"].byModel<GameAchievement>("murdermystery")
    val TurboKartRacers by json["achievements"].byModel<GameAchievement>("gingerbread")
    val SmashHeroes by json["achievements"].byModel<GameAchievement>("supersmash")
    val SkyClash by json["achievements"].byModel<GameAchievement>("skyclash")
    val SkyWars by json["achievements"].byModel<GameAchievement>("skywars")
    val VampireZ by json["achievements"].byModel<GameAchievement>("vampirez")
    val SpeedUHC by json["achievements"].byModel<GameAchievement>("speeduhc")
    val CopsAndCrims by json["achievements"].byModel<GameAchievement>("copsandcrims")
    val MegaWalls by json["achievements"].byModel<GameAchievement>("walls3")
    val UHCChampions by json["achievements"].byModel<GameAchievement>("uhc")
    val General by json["achievements"].byModel<GameAchievement>("general")
    val BlitzSurvivalGames by json["achievements"].byModel<GameAchievement>("blitz")
    val Walls by json["achievements"].byModel<GameAchievement>("walls")
    val Quake by json["achievements"].byModel<GameAchievement>("quake")
    val BedWars by json["achievements"].byModel<GameAchievement>("bedwars")
    val CrazyWalls by json["achievements"].byModel<GameAchievement>("truecombat")
    val Halloween2017 by json["achievements"].byModel<GameAchievement>("halloween2017")
}
