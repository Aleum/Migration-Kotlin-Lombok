package migration;

import lombok.Getter;
import lombok.NonNull;
import lombokM.Person;

import java.time.LocalDate;
@Getter
class Guide03J {
    private String name;
    void NonNullExample(@NonNull Person person) {
        this.name = person.getName();
    }
}

class testMain03J {
    private void main() {
        Guide03J guide = new Guide03J();
        guide.NonNullExample(new Person("", LocalDate.now()));
    }
}