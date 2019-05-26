package migration

import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException

class Guide04 {
    @Throws(IOException::class)
    fun main(args: Array<String>) {
        FileInputStream(args[0]).use {
            input -> FileOutputStream(args[1]).use {
                output -> {
                    val b = ByteArray(10000)
                    while (true) {
                        val r = input.read(b)
                        if (r == -1) break
                        output.write(b, 0, r)
                    }
                }
            }
        }
    }
}


fun main() {
    Guide04()
}