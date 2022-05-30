package test.service;

import entity.Book;
import repository.BookRepository;
import repository.BookRepositoryImpl;
import service.BookService;
import service.BookServiceImpl;

public class BookServiceTest {
    public static void main(String[] args) {
        testRemoveBook();
    }

    private static void testShowBook() {
        BookRepositoryImpl bookRepository = new BookRepositoryImpl();
        bookRepository.bookList[0] = new Book("Quarkus 1");
        bookRepository.bookList[1] = new Book("Quarkus 2");

        BookService bookService = new BookServiceImpl(bookRepository);
        bookService.showBookList();
    }

    private static void testAddBook() {
        BookRepository bookRepository = new BookRepositoryImpl();
        BookService bookService = new BookServiceImpl(bookRepository);

        bookService.addBookList("Test 1");
        bookService.addBookList("Test 2");

        bookService.showBookList();
    }

    private static void testRemoveBook() {
        BookRepository bookRepository = new BookRepositoryImpl();
        BookService bookService = new BookServiceImpl(bookRepository);

        bookService.addBookList("Test 1");
        bookService.addBookList("Test 2");
        bookService.addBookList("Test 3");

        bookService.showBookList();

        bookService.removeBookList(2);

        bookService.showBookList();
    }

}
