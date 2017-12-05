package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableInt
import com.github.salomonbrys.kotson.byNullableString
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class Warlords(val json: JsonElement) {
    val assists by json.byNullableInt
    val berserkerPlays by json.byNullableInt("berserker_plays")
    val brokenInventory by json.byNullableInt("broken_inventory")
    val chosenClass by json.byNullableString("chosen_class")
    val coins by json.byNullableInt
    val damage by json.byNullableInt
    val damageBerserker by json.byNullableInt("damage_berserker")
    val damagePrevented by json.byNullableInt("damage_prevented")
    val damagePreventedBerserker by json.byNullableInt("damage_prevented_berserker")
    val damagePreventedWarrior by json.byNullableInt("damage_prevented_warrior")
    val damageTaken by json.byNullableInt("damage_taken")
    val damageWarrior by json.byNullableInt("damage_warrior")
    val deaths by json.byNullableInt
    val flagConquerTeam by json.byNullableInt("flag_conquer_team")
    val heal by json.byNullableInt
    val healBerserker by json.byNullableInt("heal_berserker")
    val healWarrior by json.byNullableInt("heal_warrior")
    val lifeLeeched by json.byNullableInt("life_leeched")
    val lifeLeechedBerserker by json.byNullableInt("life_leeched_berserker")
    val lifeLeechedWarrior by json.byNullableInt("life_leeched_warrior")
    val mageSpec by json.byNullableString("mage_spec")
    val packages by json.byList<String>()
    val paladinSpec by json.byNullableString("paladin_spec")
    val playStreak by json.byNullableInt("play_streak")
    val selectedMount by json.byNullableString("selected_mount")
    val shamanSpec by json.byNullableString("shaman_spec")
    val warriorPlays by json.byNullableInt("warrior_plays")
    val warriorSpec by json.byNullableString("warrior_spec")
    val winStreak by json.byNullableInt("win_streak")
    val wins by json.byNullableInt
    val winsBerserker by json.byNullableInt("wins_berserker")
    val winsCapturetheflag by json.byNullableInt("wins_capturetheflag")
    val winsCapturetheflagA by json.byNullableInt("wins_capturetheflag_a")
    val winsCapturetheflagRed by json.byNullableInt("wins_capturetheflag_red")
    val winsRed by json.byNullableInt("wins_red")
    val winsWarrior by json.byNullableInt("wins_warrior")
}
