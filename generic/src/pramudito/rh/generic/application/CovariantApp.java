package pramudito.rh.generic.application;

import pramudito.rh.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> strData = new MyData<>("Robby");

        process(strData);

        MyData<? extends Object> covariantData1 = new MyData<>("Covariant");
        MyData<? extends Object> covariantData2 = strData;

        System.out.println(covariantData1.getData());
        System.out.println(covariantData2.getData());
    }

    public static void process(MyData<? extends Object> data) {
        System.out.println(data.getData());
        // data.setData("Hemawan"); // Error karena Covariant tidak bisa merubah data
    }
}
