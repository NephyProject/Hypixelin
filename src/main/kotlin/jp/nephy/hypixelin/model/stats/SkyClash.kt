package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableBool
import com.github.salomonbrys.kotson.byNullableInt
import com.github.salomonbrys.kotson.byNullableObject
import com.github.salomonbrys.kotson.byNullableString
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class SkyClash(val json: JsonElement) {
    val activeClass by json.byNullableInt("active_class")
    val assists by json.byNullableInt
    val assistsKitGuardian by json.byNullableInt("assists_kit_guardian")
    val assistsKitSwordsman by json.byNullableInt("assists_kit_swordsman")
    val bowHits by json.byNullableInt("bow_hits")
    val bowHitsKitGuardian by json.byNullableInt("bow_hits_kit_guardian")
    val bowShots by json.byNullableInt("bow_shots")
    val bowShotsKitGuardian by json.byNullableInt("bow_shots_kit_guardian")
    val cardPacks by json.byNullableInt("card_packs")
    val class0 by json.byNullableString("class_0")
    val coins by json.byNullableInt
    val deaths by json.byNullableInt
    val deathsDoubles by json.byNullableInt("deaths_doubles")
    val deathsKitGuardian by json.byNullableInt("deaths_kit_guardian")
    val deathsKitSwordsman by json.byNullableInt("deaths_kit_swordsman")
    val deathsPerkHitAndRun by json.byNullableInt("deaths_perk_hit_and_run")
    val deathsPerkRampage by json.byNullableInt("deaths_perk_rampage")
    val deathsPerkRegeneration by json.byNullableInt("deaths_perk_regeneration")
    val deathsSolo by json.byNullableInt("deaths_solo")
    val deathsTeamWar by json.byNullableInt("deaths_team_war")
    val enderchestsOpened by json.byNullableInt("enderchests_opened")
    val enderchestsOpenedKitGuardian by json.byNullableInt("enderchests_opened_kit_guardian")
    val enderchestsOpenedKitSwordsman by json.byNullableInt("enderchests_opened_kit_swordsman")
    val fastestWinTeamWar by json.byNullableInt("fastest_win_team_war")
    val fastestWinTeamWarKitGuardian by json.byNullableInt("fastest_win_team_war_kit_guardian")
    val fastestWinTeamWarKitSwordsman by json.byNullableInt("fastest_win_team_war_kit_swordsman")
    val games by json.byNullableInt
    val gamesPlayed by json.byNullableInt("games_played")
    val gamesPlayedKitGuardian by json.byNullableInt("games_played_kit_guardian")
    val gamesPlayedKitSwordsman by json.byNullableInt("games_played_kit_swordsman")
    val guardianInventory by json.byNullableObject("guardian_inventory")
    val highestKillstreak by json.byNullableInt
    val kills by json.byNullableInt
    val killsKitGuardian by json.byNullableInt("kills_kit_guardian")
    val killsKitSwordsman by json.byNullableInt("kills_kit_swordsman")
    val killsMonthlyB by json.byNullableInt("kills_monthly_b")
    val killsTeamWar by json.byNullableInt("kills_team_war")
    val killsWeeklyB by json.byNullableInt("kills_weekly_b")
    val killstreak by json.byNullableInt
    val kitGuardianMinor by json.byNullableInt("kit_guardian_minor")
    val longestBowShot by json.byNullableInt("longest_bow_shot")
    val longestBowShotKitGuardian by json.byNullableInt("longest_bow_shot_kit_guardian")
    val losses by json.byNullableInt
    val lossesDoubles by json.byNullableInt("losses_doubles")
    val lossesPerkHitAndRun by json.byNullableInt("losses_perk_hit_and_run")
    val lossesPerkRampage by json.byNullableInt("losses_perk_rampage")
    val lossesPerkRegeneration by json.byNullableInt("losses_perk_regeneration")
    val lossesSolo by json.byNullableInt("losses_solo")
    val lossesTeamWar by json.byNullableInt("losses_team_war")
    val meleeKills by json.byNullableInt("melee_kills")
    val meleeKillsKitGuardian by json.byNullableInt("melee_kills_kit_guardian")
    val meleeKillsKitSwordsman by json.byNullableInt("melee_kills_kit_swordsman")
    val mobKills by json.byNullableInt("mob_kills")
    val mobKillsKitSwordsman by json.byNullableInt("mob_kills_kit_swordsman")
    val mobsKilled by json.byNullableInt("mobs_killed")
    val mobsKilledKitSwordsman by json.byNullableInt("mobs_killed_kit_swordsman")
    val mostKillsGame by json.byNullableInt("most_kills_game")
    val mostKillsGameKitGuardian by json.byNullableInt("most_kills_game_kit_guardian")
    val mostKillsGameKitSwordsman by json.byNullableInt("most_kills_game_kit_swordsman")
    val packages by json.byList<String>()
    val perkArrowDeflection by json.byNullableInt("perk_arrow_deflection")
    val perkArrowDeflectionNew by json.byNullableBool("perk_arrow_deflection_new")
    val perkBlastProtection by json.byNullableInt("perk_blast_protection")
    val perkBlastProtectionDuplicates by json.byNullableInt("perk_blast_protection_duplicates")
    val perkBlastProtectionNew by json.byNullableBool("perk_blast_protection_new")
    val perkEnergyDrink by json.byNullableInt("perk_energy_drink")
    val perkEnergyDrinkDuplicates by json.byNullableInt("perk_energy_drink_duplicates")
    val perkEnergyDrinkNew by json.byNullableBool("perk_energy_drink_new")
    val perkGuardian by json.byNullableInt("perk_guardian")
    val perkGuardianNew by json.byNullableBool("perk_guardian_new")
    val perkHitAndRun by json.byNullableInt("perk_hit_and_run")
    val perkHitAndRunDuplicates by json.byNullableInt("perk_hit_and_run_duplicates")
    val perkMarksmanDuplicates by json.byNullableInt("perk_marksman_duplicates")
    val perkPacify by json.byNullableInt("perk_pacify")
    val perkPacifyNew by json.byNullableBool("perk_pacify_new")
    val perkPearlAbsorption by json.byNullableInt("perk_pearl_absorption")
    val perkPearlAbsorptionDuplicates by json.byNullableInt("perk_pearl_absorption_duplicates")
    val perkPearlAbsorptionNew by json.byNullableBool("perk_pearl_absorption_new")
    val perkSkeletonJockey by json.byNullableInt("perk_skeleton_jockey")
    val perkSkeletonJockeyNew by json.byNullableBool("perk_skeleton_jockey_new")
    val perkSnowGolem by json.byNullableInt("perk_snow_golem")
    val perkSnowGolemNew by json.byNullableBool("perk_snow_golem_new")
    val perkSugarRush by json.byNullableInt("perk_sugar_rush")
    val perkSugarRushNew by json.byNullableBool("perk_sugar_rush_new")
    val perkVoidMagnet by json.byNullableInt("perk_void_magnet")
    val perkVoidMagnetDuplicates by json.byNullableInt("perk_void_magnet_duplicates")
    val perkVoidMagnetNew by json.byNullableBool("perk_void_magnet_new")
    val playStreak by json.byNullableInt("play_streak")
    val playstreak by json.byNullableInt
    val quits by json.byNullableInt
    val spawnAtWitch by json.byNullableInt("spawn_at_witch")
    val swordsmanInventory by json.byNullableObject("swordsman_inventory")
    val teamWarWins by json.byNullableInt("team_war_wins")
    val teamWarWinsKitGuardian by json.byNullableInt("team_war_wins_kit_guardian")
    val teamWarWinsKitSwordsman by json.byNullableInt("team_war_wins_kit_swordsman")
    val voidKills by json.byNullableInt("void_kills")
    val voidKillsKitGuardian by json.byNullableInt("void_kills_kit_guardian")
    val winStreak by json.byNullableInt("win_streak")
    val wins by json.byNullableInt
    val winsTeamWar by json.byNullableInt("wins_team_war")
}
