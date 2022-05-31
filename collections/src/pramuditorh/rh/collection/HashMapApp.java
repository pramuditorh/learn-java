package pramuditorh.rh.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("first.name", "Robby");
        map.put("middle.name", "Hemawan");
        map.put("last.name", "Dito");
        map.put("last.name", "Pramudito"); // Update value with same key

        System.out.println(map.get("first.name"));
        System.out.println(map.get("middle.name"));
        System.out.println(map.get("last.name"));

        // Get keys
        for (var key: map.keySet()) {
            System.out.println(key);
        }
    }
}
