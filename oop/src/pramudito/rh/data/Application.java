package pramudito.rh.data;

public class Application {
    public static final int PROCESSOR;

    static {
        System.out.println("Mengakses kelas App");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
