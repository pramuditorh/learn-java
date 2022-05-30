package pramudito.rh.generic.application;

import pramudito.rh.generic.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        // Comparator vs Comparable
        // Comparator digunakan untuk class yang code nya tidak bisa diubah, contohnya library 3rd party

        Person[] people = {
                new Person("Charlie", "Indonesia"),
                new Person("Echo", "Indonesia"),
                new Person("Bravo", "Indonesia")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);

        System.out.println(Arrays.toString(people));
    }
}
