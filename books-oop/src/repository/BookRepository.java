package repository;

import entity.Book;

public interface BookRepository {
    Book[] getAll();

    void add();

    boolean remove();
}
