package pramudito.rh.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Lion El Messi";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Lion"));
        System.out.println(name.endsWith("Messi"));

        String[] names = name.split(" ");

        for (String value: names) {
            System.out.println(value);
        }
    }
}
