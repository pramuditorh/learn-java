package pramuditorh.rh.collection;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(); // Lebih baik digunakan ketika merubah data dan mengakses data index tertentu
        // List<String> strings = new LinkedList<>(); // Lebih baik digunakan ketika menambah data dan iterasi tanpa merubah data

        strings.add("Budi");
        strings.add("HP");

        strings.set(0, "Robby");

        strings.remove(1);
        System.out.println(strings.get(0));

        for (var value : strings) {
            System.out.println(value);
        }
    }
}
