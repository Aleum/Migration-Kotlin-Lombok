package migration;

import lombok.*;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
class Guide07J1 {
    private final int width, height;
}

@Data
class Guide07J2 {
    private final int width, height;
}

@Value
class Guide07J3 {
    private final int width, height;
}

@Builder
class Guide07J4 {
    private final int width, height;
}

class TestGuide07J {
    private static Guide07J1 guide1;
    public static void main(String[] args) {
        guide1 = new Guide07J1(10, 20);
        System.out.println(guide1.toString());

        Guide07J4 guide4 = Guide07J4.builder().build();
    }
}