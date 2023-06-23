package com.aleks.fullmvcdemo.Login.repository;

import com.aleks.fullmvcdemo.Login.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}