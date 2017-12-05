package jp.nephy.hypixelin

import jp.nephy.hypixelin.model.*
import jp.nephy.hypixelin.response.*

class Client(val session: Session) {
    companion object {
        fun builder() = ClientBuilder()
    }

    fun getBoosters(vararg options: Pair<String, String>): ResponseObject<GetBoosters> {
        return session.new()
                .url("/boosters")
                .params(*options)
                .get()
                .getResponseObject()
    }

    fun findGuild(name: String?=null, uuid: String?=null, vararg options: Pair<String, String>): ResponseObject<FindGuild> {
        return session.new()
                .url("/findGuild")
                .apply {
                    if (name == null && uuid == null) {
                        throw IllegalArgumentException("name or uuid must be non-null.")
                    }
                    if (name != null) {
                        param("byName" to name)
                    } else {
                        param("byUuid" to uuid!!.replace("-", ""))
                    }
                }
                .params(*options)
                .get()
                .getResponseObject()
    }

    fun getFriends(uuid: String, vararg options: Pair<String, String>): ResponseObject<GetFriends> {
        return session.new()
                .url("/friends")
                .param("uuid" to uuid.replace("-", ""))
                .params(*options)
                .get()
                .getResponseObject()
    }

    fun getGuild(guildId: String, vararg options: Pair<String, String>): ResponseObject<GetGuild> {
        return session.new()
                .url("/guild")
                .param("id" to guildId)
                .params(*options)
                .get()
                .getResponseObject()
    }

    fun getKey(vararg options: Pair<String, String>): ResponseObject<GetKey> {
        return session.new()
                .url("/key")
                .params(*options)
                .get()
                .getResponseObject()
    }

    fun getLeaderboards(vararg options: Pair<String, String>): ResponseObject<GetLeaderboards> {
        return session.new()
                .url("/leaderboards")
                .params(*options)
                .get()
                .getResponseObject()
    }

    fun getPlayer(uuid: String, vararg options: Pair<String, String>): ResponseObject<GetPlayer> {
        return session.new()
                .url("/player")
                .param("uuid" to uuid.replace("-", ""))
                .params(*options)
                .get()
                .getResponseObject()
    }

    fun getSession(uuid: String, vararg options: Pair<String, String>): ResponseObject<GetSession> {
        return session.new()
                .url("/session")
                .param("uuid" to uuid.replace("-", ""))
                .params(*options)
                .get()
                .getResponseObject()
    }

    fun getWatchdogStats(vararg options: Pair<String, String>): ResponseObject<GetWatchdogStats> {
        return session.new()
                .url("/watchdogstats")
                .params(*options)
                .get()
                .getResponseObject()
    }

    fun getMinecraftUUID(minecraftId: String, vararg options: Pair<String, String>): String {
        return session.new()
                .url("https://api.mojang.com/users/profiles/minecraft/$minecraftId")
                .params(*options)
                .get()
                .getResponseObject<MojangUUID>()
                .result.id
    }

    fun getAchievements(vararg options: Pair<String, String>): ResponseObject<Achievements> {
        return session.new()
                .url("https://github.com/HypixelDev/PublicAPI/raw/master/Documentation/misc/Achievements.json")
                .params(*options)
                .get()
                .getResponseObject()
    }
}
