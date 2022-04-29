public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Kael", "Jakarta");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Kardel");

        Person person2 = new Person("Lina");
        person2.sayHello("Rylai");

        Person person3 = new Person();
        person3.sayHello("Luna"); // person3 tidak punya name jadi method sayHello akan null field name nya
    }
}
