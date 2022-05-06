package pramudito.rh.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);

            properties.put("database.username", "secret");
            properties.put("database.table", "java-classes");

            String newUsername = properties.getProperty("database.username");
            String table = properties.getProperty("database.table");

            System.out.println(newUsername);
            System.out.println(table);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Properties properties = new Properties();

            properties.put("name.first", "Luna");
            properties.put("name.last", "Moonfang");

            properties.store(new FileOutputStream("new.properties"), "New file configuration");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
