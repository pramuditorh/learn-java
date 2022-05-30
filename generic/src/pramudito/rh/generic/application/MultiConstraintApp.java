package pramudito.rh.generic.application;

import javax.xml.namespace.QName;

public class MultiConstraintApp {
    public static void main(String[] args) {
        // Data<Manager> managerData = new Data<Manager>(new Manager()); // ERROR karena class Manager tidak implement interface
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
        System.out.println(vicePresidentData);
    }

    public static interface CanSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee {
        private String name;

        public Manager(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Manager{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static class VicePresident extends Employee implements CanSayHello {

        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }
    }

    // Bounded Type Parameter yang kedua dan selanjutnya harus berupa interface
    public static class Data<T extends Employee & CanSayHello> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
