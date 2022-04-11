package me.ethan.first.thejava;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class BookServiceTest {

    @Autowired BookService bookService;

    @Test
    public void checkDI(){
        Assert.assertNotNull(bookService);
        Assert.assertNotNull(bookService.bookRepository);
        // 어떻게 두 필드들이 null 값이 아닐까?
    }
}