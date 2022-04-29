package pramudito.rh.data;

// Record otomatis terbuat dengan constructor sesuai dengan parameter record class nya
public record LoginRequest(String username, String password) {

    // Compact constructor. Constructor tanpa ()
    public LoginRequest {
        System.out.println("Membuat object LoginRequest");
    }

    // Constructor overloading
    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }
}
