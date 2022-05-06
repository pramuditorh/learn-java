package pramudito.rh.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Lion");
        builder.append(" ");
        builder.append("El");
        builder.append(" ");
        builder.append("Messi");

        String name = builder.toString();

        System.out.println(name);
    }
}
