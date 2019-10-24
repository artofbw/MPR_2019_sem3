package lukasz.ksiegarnia.demo;

import lukasz.ksiegarnia.demo.model.Book;
import lukasz.ksiegarnia.demo.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceTests {
    private BookService service = new BookService();

    @Test
    public void findAll() {
        final List<Book> findAll = service.findAll();
        assertThat(findAll).isNotEmpty();
        assertThat(findAll.size()).isEqualTo(2);
    }

}
