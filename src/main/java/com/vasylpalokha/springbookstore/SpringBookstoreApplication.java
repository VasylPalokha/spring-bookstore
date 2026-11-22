package com.vasylpalokha.springbookstore;

import com.vasylpalokha.springbookstore.model.Book;
import com.vasylpalokha.springbookstore.service.BookService;
import java.math.BigDecimal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBookstoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBookstoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(BookService bookService) {
        return args -> {
            Book book = new Book();
            book.setTitle("Clean Code");
            book.setAuthor("Robert C. Martin");
            book.setIsbn("978-0132350884");
            book.setPrice(BigDecimal.valueOf(39.99));
            book.setDescription("A handbook of agile software craftsmanship");
            book.setCoverImage("https://example.com/clean-code.jpg");

            bookService.save(book);
            System.out.println(bookService.findAll());
        };
    }
}
