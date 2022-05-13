package me.ethan.first.thejava.di;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test; // Org.Junit 라이브러리와 차이가 있음을 기억
import static org.junit.Assert.*;
class ContainerServiceTest {

    @Test
    public void getObject_BookRepository(){
        BookRepository bookRepository = ContainerService.getObject(BookRepository.class);
        assertNotNull(bookRepository);
    }

    @Test
    public void getObject_BookService(){
        BookService bookService = ContainerService.getObject(BookService.class);
        assertNotNull(bookService);
        assertNotNull(bookService.bookRepository);
    }

}