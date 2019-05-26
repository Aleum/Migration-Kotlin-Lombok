package migration

class Guide051(var age: Int)

class Guide052 {
    var age = 10
        set(age) {
            field = this.age
        }
}


fun main() {
    val guide: Guide051 = Guide051(10)
    guide.age = 11
    println(guide.age)
    val guide2: Guide052 = Guide052()
    guide2.age = 12
    println(guide2.age)
}

