package pramudito.rh.application;

import pramudito.rh.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Tawang Corp");

        // Akses inner class melalui objek outer class nya
        Company.Employee employee = company.new Employee();
        employee.setName("Robby");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company1 = new Company();
        company1.setName("JetBrain");

        Company.Employee employee1 = company1.new Employee();
        employee1.setName("Hemawan");

        System.out.println(employee1.getName());
        System.out.println(employee1.getCompany());
    }
}
