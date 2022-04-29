package pramudito.rh.application;

import pramudito.rh.data.Animal;
import pramudito.rh.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Gendut";
        animal.run();
    }
}
