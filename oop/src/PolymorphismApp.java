class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Robby");
        employee.sayHello("Ngits");

        employee = new Manager("Robby");
        employee.sayHello("Bings");

        employee = new VicePresident("Robby");
        employee.sayHello("Memes");

        sayHello(new Employee("Robby"));
        sayHello(new Manager("Hemawan"));
        sayHello(new VicePresident("Pramudito"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
