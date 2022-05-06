package pramudito.rh.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("Lion");
        joiner.add("El");
        joiner.add("Messi");

        String name = joiner.toString();

        System.out.println(name);
    }
}
