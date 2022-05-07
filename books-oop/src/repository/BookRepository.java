package repository;

import entity.Book;

public interface BookRepository {
    Book[] getAll();

    void add(Book book);

    boolean remove(Integer number);
}
