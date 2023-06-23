package com.aleks.fullmvcdemo.books.services;
import com.aleks.fullmvcdemo.books.models.ShoppingCart;

public interface ShoppingCartService {
    void save(ShoppingCart shoppingCart);
    ShoppingCart findById(long id);
}
