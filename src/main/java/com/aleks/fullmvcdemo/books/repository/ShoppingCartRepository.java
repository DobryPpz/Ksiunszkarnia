package com.aleks.fullmvcdemo.books.repository;
import com.aleks.fullmvcdemo.books.models.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {

}
