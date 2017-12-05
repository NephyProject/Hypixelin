package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableInt
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class TNTGames(val json: JsonElement) {
    val assistsCapture by json.byNullableInt("assists_capture")
    val coins by json.byNullableInt
    val deathsBowspleef by json.byNullableInt("deaths_bowspleef")
    val deathsCapture by json.byNullableInt("deaths_capture")
    val deathsTntrun by json.byNullableInt("deaths_tntrun")
    val killsTntag by json.byNullableInt("kills_tntag")
    val newBloodwizardExplode by json.byNullableInt("new_bloodwizard_explode")
    val newBloodwizardRegen by json.byNullableInt("new_bloodwizard_regen")
    val newFirewizardExplode by json.byNullableInt("new_firewizard_explode")
    val newFirewizardRegen by json.byNullableInt("new_firewizard_regen")
    val newIcewizardExplode by json.byNullableInt("new_icewizard_explode")
    val newIcewizardRegen by json.byNullableInt("new_icewizard_regen")
    val newKineticwizardExplode by json.byNullableInt("new_kineticwizard_explode")
    val newKineticwizardRegen by json.byNullableInt("new_kineticwizard_regen")
    val newPvprunDoubleJumps by json.byNullableInt("new_pvprun_double_jumps")
    val newSpleefDoubleJumps by json.byNullableInt("new_spleef_double_jumps")
    val newSpleefRepulsor by json.byNullableInt("new_spleef_repulsor")
    val newSpleefTripleshot by json.byNullableInt("new_spleef_tripleshot")
    val newTntagSpeedy by json.byNullableInt("new_tntag_speedy")
    val newTntrunDoubleJumps by json.byNullableInt("new_tntrun_double_jumps")
    val newWitherwizardExplode by json.byNullableInt("new_witherwizard_explode")
    val newWitherwizardRegen by json.byNullableInt("new_witherwizard_regen")
    val packages by json.byList<String>()
    val recordPvprun by json.byNullableInt("record_pvprun")
    val recordTntrun by json.byNullableInt("record_tntrun")
    val runPotionsSplashedOnPlayers by json.byNullableInt("run_potions_splashed_on_players")
    val tagsBowspleef by json.byNullableInt("tags_bowspleef")
    val wins by json.byNullableInt
    val winstreak by json.byNullableInt
}
