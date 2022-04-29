package pramudito.rh.application;

import pramudito.rh.data.Car;
import pramudito.rh.data.Model3;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Model3();
        car.drive();
        System.out.println(car.getFuel());
        System.out.println(car.getBrand());
        System.out.println(car.isMaintenance());
    }
}
