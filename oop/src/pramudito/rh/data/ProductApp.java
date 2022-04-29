package pramudito.rh.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Kacamata", 200000);
        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product);

        Product product1 = new Product("Kacamata", 200000);

        System.out.println(product.equals(product1));
    }
}
