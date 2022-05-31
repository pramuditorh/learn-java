package pramuditorh.rh.lambda.app;

import pramuditorh.rh.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action(String name) {
                return "Anonymous Class " + name;
            }
        };

        System.out.println(simpleAction1.action("Robby"));


        SimpleAction simpleAction2 = (name) -> {
            return "Java Lambda " + name;
        };

        System.out.println(simpleAction2.action("Robby"));
    }
}
