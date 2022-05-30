package pramudito.rh.generic.application;

import pramudito.rh.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        wildcardPrint(new MyData<>(100));
        wildcardPrint(new MyData<>("Wildcard"));
        wildcardPrint(new MyData<>(new MultiConstraintApp.Manager("Ramos")));

    }

    public static void wildcardPrint(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
