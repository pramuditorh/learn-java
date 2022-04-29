class Parent {
    String name;
    void doIt() {
        System.out.println("Do it in parent");
    }
}

class Child extends Parent {
    String name;
    void doIt() {
        System.out.println("Do it in child");
        System.out.println("Child name: " + name);
        // Akses ke atribut name di class parent untuk mengatasi variable hiding
        System.out.println("Parent name: " + super.name);
    }
}
