package pramudito.rh.application;

import pramudito.rh.data.LoginRequest;

public class LoginApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("robby", "robbypass");
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest("robby"));
        System.out.println(new LoginRequest());
    }
}
