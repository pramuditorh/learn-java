package pramuditorh.rh.lambda.app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

        // Consumer interface adalah lambda yang dipakai buat menerima masukan aja
        Consumer<String> consumer = value -> System.out.println(value);

        consumer.accept("Robby");
        consumer.accept("Hema");
    }
}
