package com.aleks.fullmvcdemo.books.services;
import com.aleks.fullmvcdemo.books.models.Book;
import com.aleks.fullmvcdemo.books.models.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    void save(ShoppingCart shoppingCart);
    ShoppingCart findById(long id);

    List<ShoppingCart> findByBook(Book book);

    void delete(ShoppingCart shoppingCart);
}
