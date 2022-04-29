package pramudito.rh.application;

import pramudito.rh.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase(null, "pass");
        System.out.println("Database connected");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Cannot connect to database");
        }
    }
}
