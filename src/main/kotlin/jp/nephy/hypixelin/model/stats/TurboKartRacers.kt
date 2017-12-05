package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableInt
import com.github.salomonbrys.kotson.byNullableString
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class TurboKartRacers(val json: JsonElement) {
    val bananaHitsReceived by json.byNullableInt("banana_hits_received")
    val bananaHitsSent by json.byNullableInt("banana_hits_sent")
    val blueTorpedoHit by json.byNullableInt("blue_torpedo_hit")
    val boosterActive by json.byNullableString("booster_active")
    val boxPickups by json.byNullableInt("box_pickups")
    val boxPickupsCanyon by json.byNullableInt("box_pickups_canyon")
    val boxPickupsJunglerush by json.byNullableInt("box_pickups_junglerush")
    val boxPickupsMonthlyB by json.byNullableInt("box_pickups_monthly_b")
    val boxPickupsOlympus by json.byNullableInt("box_pickups_olympus")
    val boxPickupsWeeklyA by json.byNullableInt("box_pickups_weekly_a")
    val boxPickupsWeeklyB by json.byNullableInt("box_pickups_weekly_b")
    val canyonPlays by json.byNullableInt("canyon_plays")
    val coins by json.byNullableInt
    val coinsPickedUp by json.byNullableInt("coins_picked_up")
    val engineActive by json.byNullableString("engine_active")
    val frameActive by json.byNullableString("frame_active")
    val helmetActive by json.byNullableString("helmet_active")
    val horn by json.byNullableString
    val jacketActive by json.byNullableString("jacket_active")
    val junglerushPlays by json.byNullableInt("junglerush_plays")
    val lapsCompleted by json.byNullableInt("laps_completed")
    val olympusPlays by json.byNullableInt("olympus_plays")
    val packages by json.byList<String>()
    val pantsActive by json.byNullableString("pants_active")
    val parts by json.byNullableString
    val shoesActive by json.byNullableString("shoes_active")
    val skinActive by json.byNullableString("skin_active")
}
