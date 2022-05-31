package pramuditorh.rh.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> laptops = new ArrayList<>();
        laptops.add("Lenovo");
        laptops.add("Apple");
        laptops.addAll(List.of("Acer", "Asus", "HP"));

        for (var laptop: laptops) {
            System.out.println(laptop);
        }

        System.out.println("CONTAINS");
        System.out.println(laptops.contains("Lenovo"));
        System.out.println(laptops.containsAll(List.of("HP", "Apple"))); // Return true
        System.out.println(laptops.containsAll(List.of("HP", "Zyra"))); // Return false

        System.out.println("REMOVE");
        laptops.remove("Lenovo");
        laptops.removeAll(List.of("Asus", "Acer"));

        for (var laptop: laptops) {
            System.out.println(laptop);
        }
    }
}
