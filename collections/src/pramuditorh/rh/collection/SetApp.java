package pramuditorh.rh.collection;

import java.util.HashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>(); // Untuk data  yang tidak terurut
        // Set<String> names = new LinkedHashSet<>(); // Untuk data  yang terurut

        names.add("Mel");
        names.add("Mel");
        names.add("Mel");
        names.add("Leonhardt");
        names.add("Alberon");
        names.add("Shelda");
        names.add("Mara");
        names.add("Aramis");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
