package examples;

import java.util.HashSet;
import java.util.Set;

public class TestPackage {

    public static String getString() {
        return "helloworld";
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        String a = "hello_world";
        set.add(a);
        set.add(getString());
        System.out.println(set.toArray());
    }
}
