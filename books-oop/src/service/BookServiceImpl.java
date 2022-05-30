package service;

import entity.Book;
import repository.BookRepository;

public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void showBookList() {
        Book[] model = bookRepository.getAll();

        System.out.println("Daftar Buku:");

        for (int i = 0; i < model.length; i++) {
            Book bookList = model[i];
            int no = i + 1;

            if (bookList != null) {
                System.out.println(no + ". " + bookList.getBook());
            }
        }
    }

    @Override
    public void addBookList(String data) {
        Book book = new Book(data);
        bookRepository.add(book);
    }

    @Override
    public void removeBookList(Integer number) {
        bookRepository.remove(number);
    }
}
