package repository;

import entity.Book;

public class BookRepositoryImpl implements BookRepository {
    public Book[] bookList = new Book[10];
    @Override
    public Book[] getAll() {
        return bookList;
    }

    @Override
    public void add(Book book) {
        resizeIfFull();

        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] == null) {
                bookList[i] = book;
                break;
            }
        }
    }

    private boolean isFull() {
        boolean isFull = true;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] == null) {
                isFull = false;
            }
        }
        return isFull;
    }

    private void resizeIfFull() {
        if (isFull()) {
            Book[] temp = bookList;

            bookList = new Book[bookList.length * 2];

            for (int i = 0; i < temp.length; i++) {
                bookList[i] = temp[i];
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        if (number - 1 > bookList.length) {
            return false;
        } else if (bookList[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < bookList.length; i++) {
                if (i == (bookList.length - 1)) {
                    bookList[i] = null;
                }
                else {
                    bookList[i] = bookList[i + 1];
                }
            }
            return true;
        }
    }
}
