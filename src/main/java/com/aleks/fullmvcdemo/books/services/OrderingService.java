package com.aleks.fullmvcdemo.books.services;
import com.aleks.fullmvcdemo.books.models.Ordering;

import java.util.List;

public interface OrderingService {
    void save(Ordering order);
    Ordering findById(long id);
    List<Ordering> findAll();
}
