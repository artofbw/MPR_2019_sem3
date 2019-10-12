package lukasz.ksiegarnia.demo.service;

import lukasz.ksiegarnia.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    public List<Book> findAll() {
        Book book1 = new Book(1, 123, "Hehe", "Lukasz");
        Book book2 = new Book(2, 321, "Hehe1", "Lukasz1");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        return books;
    }
}
