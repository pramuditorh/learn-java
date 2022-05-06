package pramudito.rh.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        // Membaca input dari console
        Scanner scanner = new Scanner(System.in);

        // nextLine() membaca string
        System.out.print("Name: ");
        String name = scanner.nextLine();

        // nextInt() membaca integer
        System.out.print("Umur: ");
        int age = scanner.nextInt();

        System.out.println("Nama saya adalah " + name + " dan umur saya adalah " + age + " tahun.");
    }
}
