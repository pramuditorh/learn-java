package pramudito.rh.generic.application;

import pramudito.rh.generic.MyData;

public class MyDataApp {
    public static void main(String[] args) {
        MyData<Integer> dataInt = new MyData<Integer>(123);
        MyData<String> dataStr = new MyData<String>("Java");

        String strValue = dataStr.getData();
        Integer intValue = dataInt.getData();

        System.out.println(strValue);
        System.out.println(intValue);
    }
}
