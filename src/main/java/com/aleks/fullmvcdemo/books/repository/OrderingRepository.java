package com.aleks.fullmvcdemo.books.repository;
import com.aleks.fullmvcdemo.books.models.Ordering;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderingRepository extends JpaRepository<Ordering,Long> {

}
