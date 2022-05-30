package view;

import service.BookService;

import static util.InputUtil.input;

public class BookView {
    private BookService bookService;

    public BookView(BookService bookService) {
        this.bookService = bookService;
    }

    public void showBookList() {
        showTodoListLabel: while (true) {
            bookService.showBookList();

            System.out.println("MENU:");
            System.out.println("1. Tambah data.");
            System.out.println("2. Hapus data.");
            System.out.println("x. Keluar.");

            String pilih = input("Pilih");
            switch (pilih) {
                case "1":
                    addBookList();
                    break;
                case "2":
                    removeBookList();
                    break;
                case "x":
                    break showTodoListLabel;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public void addBookList() {
        System.out.println("Tambah TODO");
        String data = input("Todo (\"x\" jika ingin membatalkan)");

        // Cek jika "x" maka batal
        if ("x".equals(data)) {
        } else {
            bookService.addBookList(data);
        }
    }

    public void removeBookList() {
        System.out.println("Hapus TODO");
        String data = input("Todo (\"x\" jika ingin membatalkan)");

        // Cek jika "x" maka batal
        if ("x".equals(data)) {
        } else {
            bookService.removeBookList(Integer.valueOf(data));
        }
    }
}
