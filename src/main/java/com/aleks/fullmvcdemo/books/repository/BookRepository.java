package com.aleks.fullmvcdemo.books.repository;
import com.aleks.fullmvcdemo.books.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {

}
