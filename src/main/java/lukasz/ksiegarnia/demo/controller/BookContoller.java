package lukasz.ksiegarnia.demo.controller;

import lukasz.ksiegarnia.demo.model.Book;
import lukasz.ksiegarnia.demo.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookContoller {
    private final BookService bookService;

    public BookContoller(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/all")
    public List<Book> findAll() {
        return bookService.findAll();
    }
}
