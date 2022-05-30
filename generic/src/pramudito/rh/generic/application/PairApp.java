package pramudito.rh.generic.application;

import pramudito.rh.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pairStrInt = new Pair<>("Robby", 24);

        String strValue = pairStrInt.getFirst();
        Integer intValue = pairStrInt.getSecond();

        System.out.println(strValue);
        System.out.println(intValue);
    }
}
