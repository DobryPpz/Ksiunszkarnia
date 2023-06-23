package com.aleks.fullmvcdemo.books.services;
import com.aleks.fullmvcdemo.books.models.Book;
import com.aleks.fullmvcdemo.books.repository.BookRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Override
    @Transactional
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book findById(long id) {
        Optional<Book> b =  bookRepository.findById(id);
        return b.orElse(null);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void deleteById(long id) {
        bookRepository.deleteById(id);
    }
}
