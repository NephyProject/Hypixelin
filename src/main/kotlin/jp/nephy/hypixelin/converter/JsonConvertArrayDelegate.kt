package jp.nephy.hypixelin.converter

import com.github.salomonbrys.kotson.contains
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import kotlin.reflect.KProperty

class JsonConvertArrayDelegate<out T>(private val klass: Class<T>, private val jsonObj: JsonObject, private val key: String?, private val converter: ((JsonElement) -> Any)) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): List<T> {
        if (! jsonObj.contains(key ?: property.name) || ! jsonObj[key ?: property.name].isJsonArray) {
            return listOf()
        }

        return jsonObj[key ?: property.name].asJsonArray.map {
            it.run {
                @Suppress("UNCHECKED_CAST")
                when (klass) {
                    java.lang.String::class.java -> asString
                    java.lang.Integer::class.java -> asInt
                    java.lang.Long::class.java -> asLong
                    java.lang.Float::class.java -> asFloat
                    else -> {
                        try {
                            klass.declaredConstructors[0].newInstance(converter(this))
                        } catch (e: IllegalArgumentException) {
                            throw UnsupportedOperationException(klass.name)
                        }
                    }
                } as T
            }
        }.toList()
    }
}
