package com.vasylpalokha.springbookstore.repository;

import com.vasylpalokha.springbookstore.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
