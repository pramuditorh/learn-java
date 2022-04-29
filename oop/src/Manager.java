class Manager {
    String name;
    String company;

    public Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is Manager " + this.name);
    }

    void working() {
        System.out.println("Manager is working");
    }
}
