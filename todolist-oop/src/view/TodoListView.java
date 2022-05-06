package view;

import service.TodoListService;

import static util.InputUtil.input;

public class TodoListView {
    private static TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public void showTodolist(){

        // Tambahkan label untuk while loop agar bisa di break;
        // https://stackoverflow.com/questions/22823395/java-how-can-i-break-a-while-loop-under-a-switch-statement
        showTodoListLabel: while (true) {
            todoListService.showTodoList();

            System.out.println("MENU:");
            System.out.println("1. Tambah data.");
            System.out.println("2. Hapus data.");
            System.out.println("x. Keluar.");

            var pilih = input("Pilih");
            switch (pilih) {
                case "1":
                    addTodoList();
                    break;
                case "2":
                    removeTodoList();
                    break;
                case "x":
                    break showTodoListLabel;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void addTodoList(){
        System.out.println("Tambah TODO");
        var data = input("Todo (\"x\" jika ingin membatalkan)");

        // Cek jika "x" maka batal
        if ("x".equals(data)) {
        } else {
            todoListService.addTodoList(data);
        }
    }

    public static void removeTodoList(){
        System.out.println("Hapus TODO");
        var number = input("Nomor Todo yang dihapus (\"x\" jika ingin membatalkan)");

        if ("x".equals(number)) {
        } else {
            todoListService.removeTodoList(Integer.parseInt(number));
        }
    }
}
