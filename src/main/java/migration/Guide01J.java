package migration;

import lombok.val;

import java.util.ArrayList;

class Guide01J {
    String Example() {
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        return foo.toLowerCase();
    }
}

class testMain {
    public static void main() {
        Guide01J jguide01 = new Guide01J();
        System.out.print(jguide01.Example());
    }
}