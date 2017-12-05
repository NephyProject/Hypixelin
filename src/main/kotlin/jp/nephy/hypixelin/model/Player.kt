package jp.nephy.hypixelin.model

import com.github.salomonbrys.kotson.*
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byLambda
import jp.nephy.hypixelin.converter.byList
import jp.nephy.hypixelin.converter.byModel
import jp.nephy.hypixelin.enum.HypixelRank
import java.util.*

class Player(val json: JsonElement) {
    val id by json.byString("_id")
    val uuid by json.byString("uuid")
    val firstLogin by json.byLong
    val playerName by json.byString("playername")
    val lastLogin by json.byLong
    val displayName by json.byString("displayname")
    val knownAliases by json.byList<String>()
    val knownAliasesLower by json.byList<String>()
    val achievementsOneTime by json.byList<String>()
    val stats by json.byModel<Stats>()
    val mcVersionRp by json.byString
    val karma by json.byLong
    val networkExp by json.byDouble
    val petConsumables by json.byLambda { asJsonObject.toMap().map { it.key to it.value.asInt }.toMap() }
    val vanityMeta by json.byModel<VanityMeta>()
    val achievements by json.byLambda { asJsonObject.toMap().map { it.key to it.value.asInt }.toMap() }
    val settings by json.byLambda { asJsonObject.toMap().map { it.key to it.value.asBoolean }.toMap() }
    val parkourCompletions by json.byLambda { asJsonObject.toMap().map { it.key to it.value.asJsonArray.map { ParkourCompletion(it) } }.toMap() }
    val lastAdsenseGenerateTime by json.byLong
    val eugene by json.byModel<Eugene>()
    val lastClaimedReward by json.byLong
    val totalRewards by json.byInt
    val totalDailyRewards by json.byInt
    val rewardStreak by json.byInt
    val rewardScore by json.byInt
    val rewardHighScore by json.byInt
    val housingMeta by json.byModel<HousingMeta>()
    val websiteSet by json.byBool
    val channel by json.byString
    val friendRequestsUuid by json.byList<String>()
    val outfit by json.byLambda { asJsonObject.toMap().map { it.key to it.value.asString }.toMap() }
    val quests by json.byModel<Quests>()
    val newPackageRank by json.byLambda { HypixelRank.valueOf(this.asString) }
    val questSettings by json.byLambda { asJsonObject.toMap().map { it.key to it.value.asBoolean }.toMap() }
    val particlePack by json.byString
    val petJourneyTimestamp by json.byLong()
    val vanityFavorites by json.byLambda { asString.split(";") }
    val particleQuality by json.byString
    val adsenseTokens by json.byInt("adsense_tokens")
    val quickjoinTimestamp by json.byLong("quickjoin_timestamp")
    val quickjoinUses by json.byInt("quickjoin_uses")
    val specNightVision by json.byBool("spec_night_vision")
    val halloween2016Cooldowns by json.byLambda { asJsonObject.toMap().map { it.key to it.value.asBoolean }.toMap() }
    val holiday2016Cooldowns by json.byLambda { asJsonObject.toMap().map { it.key to it.value.asBoolean }.toMap() }
    val currentCloak by json.byString
    val giftingMeta by json.byModel<GiftingMeta>()
    val userLanguage by json.byString
    val socialMedia by json.byNullableObject
    val voting by json.byModel<Voting>()
    val showTipHolograms by json.byBool("show_tip_holograms")
    val showTNTTagActionbarInfo by json.byBool("show_tnttag_actionbar_info")
    val specSpeed by json.byInt("spec_speed")
    val showTNTRunActionbarInfo by json.byBool("show_tntrun_actionbar_info")
    val newMainTutorial by json.byBool
    val lastLogout by json.byLong
    val networkUpdateBook by json.byString
    val halloween2017Cooldowns by json.byLambda { asJsonObject.toMap().map { it.key to it.value.asBoolean }.toMap() }
    val currentPet by json.byString
    val challenges by json.byObject
    val adventRewards2017 by json.byLambda { asJsonObject.toMap().map { it.key to it.value.asLong }.toMap() }
    val achievementTracking by json.byList<String>()
    val christmas2017Cooldowns by json.byLambda { asJsonObject.toMap().map { it.key to it.value.asBoolean }.toMap() }
    val achievementRewardsNew by json.byLambda { asJsonObject.toMap().map { it.key to it.value.asLong }.toMap() }
    val showWizardsAtionbarInfo by json.byBool("show_wizards_actionbar_info")
    val mostRecentGameType by json.byString
    val specFirstPerson by json.byBool("spec_first_person")

    fun hasReceivedLevelingReward(level: Int): Boolean {
        val key = "levelingReward_$level"
        return json.asJsonObject.contains(key) && json[key].asBoolean
    }

    private fun hasReceivedMonthlyMysteryBoxes(rank: HypixelRank, year: Int, month: Int): Boolean {
        val key = "dmcrates-$month-$year"
        return json.asJsonObject.contains(key) && json[key].asJsonObject.contains(rank.name) && json[key][rank.name].asBoolean
    }

    fun hasReceivedMonthlyMysteryBoxes(rank: HypixelRank, calendar: Calendar): Boolean {
        return hasReceivedMonthlyMysteryBoxes(rank, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH))
    }

    fun hasReceivedFoundReward(who: String): Boolean {
        val key = "REWARD_FIND_$who".toUpperCase()
        return json.asJsonObject.contains(key) && json[key].asBoolean
    }

    fun getEpochTimeWhenPurchasedRank(rank: HypixelRank): Long? {
        val key = "levelUp_${rank.name}"
        return if (json.asJsonObject.contains(key)) {
            json[key].asLong
        } else {
            null
        }
    }
}
