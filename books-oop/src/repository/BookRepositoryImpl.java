package repository;

import entity.Book;

public class BookRepositoryImpl implements BookRepository{
    @Override
    public Book[] getAll() {
        return new Book[0];
    }

    @Override
    public void add() {

    }

    @Override
    public boolean remove() {
        return false;
    }
}
