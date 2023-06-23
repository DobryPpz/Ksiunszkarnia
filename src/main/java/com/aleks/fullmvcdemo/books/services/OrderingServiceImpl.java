package com.aleks.fullmvcdemo.books.services;
import com.aleks.fullmvcdemo.books.models.Ordering;
import com.aleks.fullmvcdemo.books.repository.OrderingRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderingServiceImpl implements OrderingService {

    private OrderingRepository orderRepository;

    @Override
    @Transactional
    public void save(Ordering order) {
        orderRepository.save(order);
    }

    @Override
    public Ordering findById(long id) {
        Optional<Ordering> o = orderRepository.findById(id);
        return o.orElse(null);
    }

    @Override
    public List<Ordering> findAll() {
        return orderRepository.findAll();
    }
}
