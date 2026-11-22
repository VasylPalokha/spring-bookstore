package com.vasylpalokha.springbookstore.service;

import com.vasylpalokha.springbookstore.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
