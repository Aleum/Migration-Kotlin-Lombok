package migration

import java.io.UnsupportedEncodingException
import java.nio.charset.StandardCharsets

class Guide08 {

    @Throws(UnsupportedEncodingException::class)
    fun utf8ToString(bytes: ByteArray): String {
        if (bytes.isEmpty()) {
            throw UnsupportedEncodingException()
        }
        return String(bytes, StandardCharsets.UTF_8)
    }
}

fun main() {
    val guide = Guide08()

    println(guide.utf8ToString("test".toByteArray()))
    println(guide.utf8ToString("".toByteArray()))

}

