package migration

data class Guide07(var width: Int, var height: Int)

fun main() {
    val guide1 = Guide07(10, 20)

    val guide2 = Guide07(height=20, width=10)

    guide1.height
    guide2.height
}

