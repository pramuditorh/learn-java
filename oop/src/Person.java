class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor overloading
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person(String name) {
        // Memanggil constructor atas nya yang berisi 2 parameter (paramName, paramAddress)
        this(name, null);
    }

    // Constructor kosong atau default constructor
    public Person() {
        // Memanggil constructor atas nya yang berisi 1 parameter (paramName)
        this(null);
    }


    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is " + this.name);
    }
}
