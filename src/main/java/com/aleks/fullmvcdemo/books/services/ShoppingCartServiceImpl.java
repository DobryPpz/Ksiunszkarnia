package com.aleks.fullmvcdemo.books.services;
import com.aleks.fullmvcdemo.books.models.ShoppingCart;
import com.aleks.fullmvcdemo.books.repository.ShoppingCartRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private ShoppingCartRepository shoppingCartRepository;

    @Override
    @Transactional
    public void save(ShoppingCart shoppingCart) {
        shoppingCartRepository.save(shoppingCart);
    }

    @Override
    public ShoppingCart findById(long id) {
        Optional<ShoppingCart> s = shoppingCartRepository.findById(id);
        return s.orElse(null);
    }
}
