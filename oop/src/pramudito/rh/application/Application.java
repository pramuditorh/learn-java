package pramudito.rh.application;

import pramudito.rh.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("SteelSeries", 1000000);
//        Error karena field name protected
//        System.out.println(product.name);
//        Error karena field price protected
//        System.out.println(product.price);
    }
}
