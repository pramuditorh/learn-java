import repository.BookRepository;
import repository.BookRepositoryImpl;
import service.BookService;
import service.BookServiceImpl;
import view.BookView;

public class BookApp {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepositoryImpl();
        BookService bookService = new BookServiceImpl(bookRepository);
        BookView bookView = new BookView(bookService);

        bookView.showBookList();
    }
}
