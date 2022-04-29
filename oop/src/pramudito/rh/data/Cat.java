package pramudito.rh.data;

public class Cat extends Animal{
    // Karena extend abstract class maka harus implement method yang ada di abstract class
    public void run() {
        System.out.println("Cat " + name + " is run");
    }
}
