package jp.nephy.hypixelin

import jp.nephy.hypixelin.model.BoostersResponse
import jp.nephy.hypixelin.model.FindGuildResponse
import jp.nephy.hypixelin.model.FriendsResponse
import jp.nephy.hypixelin.model.GuildResponse

class Client(val session: Session) {
    companion object {
        fun builder() = ClientBuilder()
    }

    fun getBoosters(vararg options: Pair<String, String>): ResponseObject<BoostersResponse> {
        return session.new()
                .url("/boosters")
                .params(*options)
                .get()
                .getResponseObject()
    }

    fun findGuild(name: String?=null, uuid: String?=null, vararg options: Pair<String, String>): ResponseObject<FindGuildResponse> {
        return session.new()
                .url("/findGuild")
                .apply {
                    if (name == null && uuid == null) {
                        throw IllegalArgumentException("name or uuid must be non-null.")
                    }
                    if (name != null) {
                        param("byName" to name)
                    } else {
                        param("byUuid" to uuid!!)
                    }
                }
                .params(*options)
                .get()
                .getResponseObject()
    }

    fun getFriends(uuid: String, vararg options: Pair<String, String>): ResponseObject<FriendsResponse> {
        return session.new()
                .url("/friends")
                .param("uuid" to uuid)
                .params(*options)
                .get()
                .getResponseObject()
    }

    fun getGuild(guildId: String, vararg options: Pair<String, String>): ResponseObject<GuildResponse> {
        return session.new()
                .url("/guild")
                .param("id" to guildId)
                .params(*options)
                .get()
                .getResponseObject()
    }
}
