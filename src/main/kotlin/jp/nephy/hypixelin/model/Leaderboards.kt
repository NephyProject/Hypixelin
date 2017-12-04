package jp.nephy.hypixelin.model

import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class Leaderboards(val json: JsonElement) {
    val TNTGames by json.byList<LeaderboardGame>("TNTGAMES")
    val Walls by json.byList<LeaderboardGame>("WALLS")
    val Quake by json.byList<LeaderboardGame>("QUAKECRAFT")
    val SkyWars by json.byList<LeaderboardGame>("SKYWARS")
    val Prototype by json.byList<LeaderboardGame>("PROTOTYPE")
    val VampireZ by json.byList<LeaderboardGame>("VAMPIREZ")
    val MegaWalls by json.byList<LeaderboardGame>("WALLS3")
    val SkyClash by json.byList<LeaderboardGame>("SKYCLASH")
    val BedWars by json.byList<LeaderboardGame>("BEDWARS")
    val UHCChampions by json.byList<LeaderboardGame>("UHC")
    val Paintball by json.byList<LeaderboardGame>("PAINTBALL")
    val SmashHeroes by json.byList<LeaderboardGame>("SUPER_SMASH")
    val CrazyWalls by json.byList<LeaderboardGame>("TRUE_COMBAT")
    val CopsAndCrims by json.byList<LeaderboardGame>("MCGO")
    val Warlords by json.byList<LeaderboardGame>("BATTLEGROUND")
    val MurderMystery by json.byList<LeaderboardGame>("MURDER_MYSTERY")
    val BlitzSurvialGames by json.byList<LeaderboardGame>("SURVIVAL_GAMES")
    val SpeedUHC by json.byList<LeaderboardGame>("SPEED_UHC")
    val Arcade by json.byList<LeaderboardGame>("ARCADE")
    val Arena by json.byList<LeaderboardGame>("ARENA")
    val TurboKartRacers by json.byList<LeaderboardGame>("GINGERBREAD")
}
