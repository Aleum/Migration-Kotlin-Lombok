package migration

class Guide01 {
    fun Example(): String {
        val example: ArrayList<String> = ArrayList<String>()
        example.add("Hello, World!")
        val foo = example[0]
        return foo.toLowerCase()
    }
}

fun main() {
    val guide01: Guide01 = Guide01()
    print(guide01.Example())
}