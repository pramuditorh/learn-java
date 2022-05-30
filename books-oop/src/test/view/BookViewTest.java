package test.view;

import repository.BookRepository;
import repository.BookRepositoryImpl;
import service.BookService;
import service.BookServiceImpl;
import view.BookView;

public class BookViewTest {
    public static void main(String[] args) {
        testRemoveBookList();
    }

    private static void testRemoveBookList() {
        BookRepository bookRepository = new BookRepositoryImpl();
        BookService bookService = new BookServiceImpl(bookRepository);
        BookView bookView = new BookView(bookService);

        bookView.removeBookList();
    }

    private static void testAddBookList() {
        BookRepository bookRepository = new BookRepositoryImpl();
        BookService bookService = new BookServiceImpl(bookRepository);
        BookView bookView = new BookView(bookService);

        bookView.addBookList();
    }

    private static void testShowBookList() {
        BookRepository bookRepository = new BookRepositoryImpl();
        BookService bookService = new BookServiceImpl(bookRepository);
        BookView bookView = new BookView(bookService);

        bookService.addBookList("Quarkus 101");
        bookService.addBookList("Quarkus 202");
        bookService.addBookList("Quarkus 303");

        bookView.showBookList();
    }
}
