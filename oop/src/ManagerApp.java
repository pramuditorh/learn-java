class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Robby", "Valve");
        manager.sayHello("Pepe");

        VicePresident vicePresident = new VicePresident("Pramudito");
        System.out.println("Perusahaan Vice President " + vicePresident.company);
        vicePresident.sayHello("Meme");
        vicePresident.sayHelloToManager();
        vicePresident.workWithManager();
    }
}
