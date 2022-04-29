class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Robby";
        // Parent name dari class parent akan print null, variable hiding
        child.doIt();
        System.out.println("Child name: " + child.name);

        Parent parent = (Parent) child;
        // Menginisialisasi atribut name yang ada di class parent, karena object child sudah di cast ke tipe Parent
        parent.name = "Hemawan";
        // Parent name dari class parent akan print Hemawan
        // Method override, karena object nya dari class Child, maka yang diakses adalah method doIt() di child
        parent.doIt();
    }
}
