class VicePresident extends Manager{
    // Ketika class parent ada constructor, class child harus memanggil constructor class parent dengan super
    public VicePresident(String name) {
        super(name, null);
    }

    // Method overriding dari class parent Manager
    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is Vice President " + this.name);
    }

    // Akses properties name yang ada di class parent Manager
    void sayHelloToManager() {
        System.out.println("Hello Manager " + super.name);
    }

    void working() {
        System.out.println("Vice President is working");
    }

    void workWithManager() {
        System.out.println("Vice President working with Manager");
        // Memanggil method working di class parent Manager
        super.working();
        // Memanggil method working di dalam class VicePresident
        working();
    }
}
