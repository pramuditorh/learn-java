package pramudito.rh.generic.application;

import static pramudito.rh.generic.util.ArrayCountHelper.count;

public class ArrayCountApp {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String [] names = {"Robby", "Hemawan", "Pramudito"};

        System.out.println(count(numbers));
        System.out.println(count(names));
    }
}
