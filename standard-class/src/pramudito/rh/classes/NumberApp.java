package pramudito.rh.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;
        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        // Konversi string to number
        String strNum = "1000";

        Integer contohInt = Integer.valueOf(strNum);
        int contohInt2 = Integer.parseInt(strNum);

        System.out.println(longValue);
        System.out.println(longValue.getClass().getSimpleName());
        System.out.println(doubleValue);
        System.out.println(doubleValue.getClass().getSimpleName());
        System.out.println(shortValue);
        System.out.println(shortValue.getClass().getSimpleName());
        System.out.println(contohInt);
        System.out.println(contohInt.getClass().getSimpleName());
        System.out.println(contohInt2);
    }
}
