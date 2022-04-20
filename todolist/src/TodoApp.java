public class TodoApp {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        testAddTodoList();
    }

    /**
     * Method untuk menampilkan list todo
     */
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;
            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "Makan";
        model[1] = "Minum";
        showTodoList();
    }

    /**
     * Method untuk menambah todo ke list
     */
    public static void addTodoList(String todo) {
        // Cek apakah array model sudah penuh
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false;
                break;
            }
        }

        // Jika penuh, resize ukuran array model menjadi 2x lipat
        if (isFull) {
            // Variable temprary untuk menampung isi array model existing
            var temp = model;

            // Resize, jika tidak di backup maka data yang sudah diisi sebelumnya akan hilang
            model = new String[model.length * 2];

            // Copy isi dari variable temp kembali ke array model
            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // Tambahkan data ke posisi array yang masih NULL
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList() {
        for (int i = 0; i < 25; i++) {
            addTodoList("Todo ke-" + i);
        }

        showTodoList();
    }

    /**
     * Method untuk menghapus todo dari list
     */
    public static void deleteTodoList() {

    }

    /**
     * Method menampilkan view todo list
     */
    public static void viewShowTodoList() {

    }

    /**
     * Method menampilkan view menambahkan todo ke list
     */
    public static void viewAddTodoList() {

    }

    /**
     * Method menampilkan view menghapus todo dari list
     */
    public static void viewDeleteTodoList() {

    }
}
