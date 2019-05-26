package migration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Guide05J {
    private int age = 10;
}


class TestGuide05J {
    Guide05J guide;
}