package migration

import lombokM.Person
import java.time.LocalDate

class Guide03(var name: String) {
    fun NonNullExample(person: Person) {
        this.name = person.name
    }
}

fun main() {
    val guide01: Guide03 = Guide03("dd")
    print(guide01.NonNullExample(Person("", LocalDate.now())))
}