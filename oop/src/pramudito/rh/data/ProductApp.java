package pramudito.rh.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Kacamata", 200000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
