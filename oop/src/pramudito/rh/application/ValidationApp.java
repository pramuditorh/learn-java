package pramudito.rh.application;

import pramudito.rh.data.LoginRequest;
import pramudito.rh.error.ValidationException;
import pramudito.rh.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, "robby");

        // Checked Exception perlu menggunakan try-catch saat menjalankan program
        try {
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException | NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Always executed");
        }

        // Checked Exception tidak perlu menggunakan try-catch saat menjalankan program
        // Tapi program akan berhenti ketika error
        LoginRequest loginRequest1 = new LoginRequest();
        ValidationUtil.validateRuntime(loginRequest1);
    }
}
