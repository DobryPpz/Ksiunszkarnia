package com.aleks.fullmvcdemo.books.services;
import com.aleks.fullmvcdemo.books.models.Book;

import java.util.List;

public interface BookService {
    void save(Book book);
    Book findById(long id);
    List<Book> findAll();
    void deleteById(long id);
}
