package pramudito.rh.data;

// Outer class
public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Inner class
    public class Employee {
        private String name;

        // Method untuk mendapatkan atribut name dari outer class nya
        public String getCompany() {
            return Company.this.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
