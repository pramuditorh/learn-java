package pramudito.rh.generic;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Charlie", "Indonesia"),
                new Person("Echo", "Indonesia"),
                new Person("Bravo", "Indonesia")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));

    }
}
