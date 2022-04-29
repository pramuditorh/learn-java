class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is Employee " + this.name);
    }
}
