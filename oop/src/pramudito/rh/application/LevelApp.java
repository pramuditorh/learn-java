package pramudito.rh.application;

import pramudito.rh.data.Customer;
import pramudito.rh.data.Level;

public class LevelApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Robby");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print ENUM");
        for (Level value: Level.values()){
            System.out.println(value);
        }
    }
}
