package jp.nephy.hypixelin.model.stats

import com.github.salomonbrys.kotson.byNullableBool
import com.github.salomonbrys.kotson.byNullableInt
import com.github.salomonbrys.kotson.byNullableString
import com.google.gson.JsonElement
import jp.nephy.hypixelin.converter.byList

class MurderMystery(val json: JsonElement) {
    val activeKnifeSkin by json.byNullableString("active_knife_skin")
    val coins by json.byNullableInt
    val coinsPickedup by json.byNullableInt("coins_pickedup")
    val coinsPickedupMurderAssassins by json.byNullableInt("coins_pickedup_MURDER_ASSASSINS")
    val coinsPickedupMurderClassic by json.byNullableInt("coins_pickedup_MURDER_CLASSIC")
    val coinsPickedupCruiseShip by json.byNullableInt("coins_pickedup_cruise_ship")
    val coinsPickedupCruiseShipMurderClassic by json.byNullableInt("coins_pickedup_cruise_ship_MURDER_CLASSIC")
    val coinsPickedupHollywood by json.byNullableInt("coins_pickedup_hollywood")
    val coinsPickedupHollywoodMurderAssassins by json.byNullableInt("coins_pickedup_hollywood_MURDER_ASSASSINS")
    val coinsPickedupLibrary by json.byNullableInt("coins_pickedup_library")
    val coinsPickedupLibraryMurderClassic by json.byNullableInt("coins_pickedup_library_MURDER_CLASSIC")
    val deaths by json.byNullableInt
    val deathsMurderAssassins by json.byNullableInt("deaths_MURDER_ASSASSINS")
    val deathsMurderClassic by json.byNullableInt("deaths_MURDER_CLASSIC")
    val deathsHollywood by json.byNullableInt("deaths_hollywood")
    val deathsHollywoodMurderAssassins by json.byNullableInt("deaths_hollywood_MURDER_ASSASSINS")
    val deathsLibrary by json.byNullableInt("deaths_library")
    val deathsLibraryMurderClassic by json.byNullableInt("deaths_library_MURDER_CLASSIC")
    val detectiveChance by json.byNullableInt("detective_chance")
    val games by json.byNullableInt
    val gamesMurderAssassins by json.byNullableInt("games_MURDER_ASSASSINS")
    val gamesMurderClassic by json.byNullableInt("games_MURDER_CLASSIC")
    val gamesMurderInfection by json.byNullableInt("games_MURDER_INFECTION")
    val gamesCruiseShip by json.byNullableInt("games_cruise_ship")
    val gamesCruiseShipMurderClassic by json.byNullableInt("games_cruise_ship_MURDER_CLASSIC")
    val gamesCruiseShipMurderInfection by json.byNullableInt("games_cruise_ship_MURDER_INFECTION")
    val gamesHollywood by json.byNullableInt("games_hollywood")
    val gamesHollywoodMurderAssassins by json.byNullableInt("games_hollywood_MURDER_ASSASSINS")
    val gamesHollywoodMurderInfection by json.byNullableInt("games_hollywood_MURDER_INFECTION")
    val gamesLibrary by json.byNullableInt("games_library")
    val gamesLibraryMurderClassic by json.byNullableInt("games_library_MURDER_CLASSIC")
    val gamesTransport by json.byNullableInt("games_transport")
    val gamesTransportMurderInfection by json.byNullableInt("games_transport_MURDER_INFECTION")
    val killsAsInfected by json.byNullableInt("kills_as_infected")
    val killsAsInfectedMurderInfection by json.byNullableInt("kills_as_infected_MURDER_INFECTION")
    val killsAsInfectedCruiseShip by json.byNullableInt("kills_as_infected_cruise_ship")
    val killsAsInfectedCruiseShipMurderInfection by json.byNullableInt("kills_as_infected_cruise_ship_MURDER_INFECTION")
    val killsAsInfectedTransport by json.byNullableInt("kills_as_infected_transport")
    val killsAsInfectedTransportMurderInfection by json.byNullableInt("kills_as_infected_transport_MURDER_INFECTION")
    val killsAsSurvivor by json.byNullableInt("kills_as_survivor")
    val killsAsSurvivorMurderInfection by json.byNullableInt("kills_as_survivor_MURDER_INFECTION")
    val killsAsSurvivorCruiseShip by json.byNullableInt("kills_as_survivor_cruise_ship")
    val killsAsSurvivorCruiseShipMurderInfection by json.byNullableInt("kills_as_survivor_cruise_ship_MURDER_INFECTION")
    val longestTimeAsSurvivorSeconds by json.byNullableInt("longest_time_as_survivor_seconds")
    val longestTimeAsSurvivorSecondsMurderInfection by json.byNullableInt("longest_time_as_survivor_seconds_MURDER_INFECTION")
    val longestTimeAsSurvivorSecondsCruiseShip by json.byNullableInt("longest_time_as_survivor_seconds_cruise_ship")
    val longestTimeAsSurvivorSecondsCruiseShipMurderInfection by json.byNullableInt("longest_time_as_survivor_seconds_cruise_ship_MURDER_INFECTION")
    val longestTimeAsSurvivorSecondsHollywood by json.byNullableInt("longest_time_as_survivor_seconds_hollywood")
    val longestTimeAsSurvivorSecondsHollywoodMurderInfection by json.byNullableInt("longest_time_as_survivor_seconds_hollywood_MURDER_INFECTION")
    val murdererChance by json.byNullableInt("murderer_chance")
    val murdermysteryBooks by json.byList<String>("murdermystery_books")
    val totalTimeSurvivedSeconds by json.byNullableInt("total_time_survived_seconds")
    val totalTimeSurvivedSecondsMurderInfection by json.byNullableInt("total_time_survived_seconds_MURDER_INFECTION")
    val totalTimeSurvivedSecondsCruiseShip by json.byNullableInt("total_time_survived_seconds_cruise_ship")
    val totalTimeSurvivedSecondsCruiseShipMurderInfection by json.byNullableInt("total_time_survived_seconds_cruise_ship_MURDER_INFECTION")
    val totalTimeSurvivedSecondsHollywood by json.byNullableInt("total_time_survived_seconds_hollywood")
    val totalTimeSurvivedSecondsHollywoodMurderInfection by json.byNullableInt("total_time_survived_seconds_hollywood_MURDER_INFECTION")
    val totalTimeSurvivedSecondsTransport by json.byNullableInt("total_time_survived_seconds_transport")
    val totalTimeSurvivedSecondsTransportMurderInfection by json.byNullableInt("total_time_survived_seconds_transport_MURDER_INFECTION")
    val wasSpecialRoleLastGame by json.byNullableBool
    val wins by json.byNullableInt
    val winsMurderClassic by json.byNullableInt("wins_MURDER_CLASSIC")
    val winsCruiseShip by json.byNullableInt("wins_cruise_ship")
    val winsCruiseShipMurderClassic by json.byNullableInt("wins_cruise_ship_MURDER_CLASSIC")
    val winsLibrary by json.byNullableInt("wins_library")
    val winsLibraryMurderClassic by json.byNullableInt("wins_library_MURDER_CLASSIC")
}
