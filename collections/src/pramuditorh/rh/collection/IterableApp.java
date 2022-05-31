package pramuditorh.rh.collection;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> iterables = List.of("Intellij", "Idea", "Community", "Edition");

        for (var iterable: iterables) {
            System.out.println(iterable);
        }
    }
}
