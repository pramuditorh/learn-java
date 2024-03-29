import java.util.Scanner;

public class TodoApp {

    public static String[] model = new String[10];

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();
    }

    /**
     * Method untuk menampilkan list todo
     */
    public static void showTodoList() {
        System.out.println("To Do List:");
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
    public static boolean deleteTodoList(int number) {
        // Cek apakah index data yang akan dihapus lebih besar sama dengan panjang array nya
        if ((number - 1) >= model.length) {
            return false;
        }
        // Cek apakah data yang akan dihapus bernilai null
        else if (model[number - 1] == null) {
            return false;
        } else {
            // Perulangan untuk menggeser data yang dihapus ke paling ujung kanan (index paling besar)
            for (int i = (number - 1); i < model.length; i++) {
                // Cek apakah index paling kanan, ubah data menjadi null
                if (i == (model.length - 1)) {
                    model[i] = null;
                }
                // Tukar data index sekarang dengan data index selanjutnya
                else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testDeleteTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        var res = deleteTodoList(20);
        System.out.println(res);

        res = deleteTodoList(7);
        System.out.println(res);

        res = deleteTodoList(1);
        System.out.println(res);

        res = deleteTodoList(2);
        System.out.println(res);

        showTodoList();

    }

    /**
     * Method untuk menerima input user
     */
    public static String input(String info) {
        System.out.print(info + ": ");
        String inputData = scanner.nextLine();
        return inputData;
    }

    public static void testInput() {
        var name= input("Nama");
        System.out.println("Hello " + name);

        var balance = input("Saldo anda");
        System.out.println("Jumlah saldo anda adalah " + balance);
    }

    /**
     * Method menampilkan view todo list
     */
    public static void viewShowTodoList() {
        // Tambahkan label untuk while loop agar bisa di break;
        // https://stackoverflow.com/questions/22823395/java-how-can-i-break-a-while-loop-under-a-switch-statement
        showTodoListLabel: while (true) {
            showTodoList();

            System.out.println("MENU:");
            System.out.println("1. Tambah data.");
            System.out.println("2. Hapus data.");
            System.out.println("x. Keluar.");

            var pilih = input("Pilih");
            switch (pilih) {
                case "1":
                    viewAddTodoList();
                    break;
                case "2":
                    viewDeleteTodoList();
                    break;
                case "x":
                    break showTodoListLabel;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void testViewShowTodoList() {
        addTodoList("Makan");
        addTodoList("Minum");
        addTodoList("Olahraga");
        addTodoList("Bekerja");

        viewShowTodoList();
    }

    /**
     * Method menampilkan view menambahkan todo ke list
     */
    public static void viewAddTodoList() {
        System.out.println("Tambah TODO");
        var data = input("Todo (\"x\" jika ingin membatalkan)");

        // Cek jika "x" maka batal
        if ("x".equals(data)) {
        } else {
            addTodoList(data);
        }
    }

    public static void testViewAddTodoList() {
        addTodoList("Makan");
        addTodoList("Minum");

        viewAddTodoList();
        showTodoList();
    }

    /**
     * Method menampilkan view menghapus todo dari list
     */
    public static void viewDeleteTodoList() {
        System.out.println("Hapus TODO");
        var number = input("Nomor Todo yang dihapus (\"x\" jika ingin membatalkan)");

        if ("x".equals(number)) {
        } else {
            // Konversi string ke integer
            boolean success = deleteTodoList(Integer.parseInt(number));

            if (!success) {
                System.out.println("Gagal mennghapus todo");
            }
        }
    }

    public static void testViewDeleteTodoList() {
        addTodoList("Makan");
        addTodoList("Minum");

        showTodoList();
        viewDeleteTodoList();
        showTodoList();
    }
}
