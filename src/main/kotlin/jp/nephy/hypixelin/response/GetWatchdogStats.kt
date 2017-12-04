package jp.nephy.hypixelin.response

import com.github.salomonbrys.kotson.byBool
import com.github.salomonbrys.kotson.byInt
import com.google.gson.JsonElement

class GetWatchdogStats(val json: JsonElement) {
    val success by json.byBool
    val staffRollingdaily by json.byInt("staff_rollingDaily")
    val staffTotal by json.byInt("staff_total")
    val watchdogLastminute by json.byInt("watchdog_lastMinute")
    val watchdogRollingdaily by json.byInt("watchdog_rollingDaily")
    val watchdogTotal by json.byInt("watchdog_total")
}
