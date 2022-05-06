package pramudito.rh.classes;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String original = "Intellij IDEA";

        String encoded = Base64.getEncoder().encodeToString(original.getBytes(StandardCharsets.UTF_8));
        System.out.println(encoded);

        // Decode return nya byte[]
        byte[] decoded = Base64.getDecoder().decode(encoded);

        // Konversi dari byte ke string
        String result = new String(decoded);
        System.out.println(result);


    }
}
