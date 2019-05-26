package migration;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Guide06J {
    private final int width, height;

    public Guide06J(int width, int height) {
        this.width = width;
        this.height = height;
    }
}


class TestGuide06J {
    private static Guide06J guide;
    public static void main(String[] args) {
        guide = new Guide06J(10, 20);
        System.out.println(guide.toString());
    }
}