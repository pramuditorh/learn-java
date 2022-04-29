package pramudito.rh.application;

import pramudito.rh.data.City;

public class LocationApp {
    public static void main(String[] args) {
        // Location location = new Location(); ERROR karena abstract
        City city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
