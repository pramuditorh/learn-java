public class TodoApp {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        testShowTodoList();
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
    public static void addTodoList() {

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
