class Manager extends Employee {
    String company;

    public Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    public Manager(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is Manager " + this.name);
    }

    void working() {
        System.out.println("Manager is working");
    }
}
