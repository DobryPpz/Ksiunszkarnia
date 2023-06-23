package com.aleks.fullmvcdemo.books.models;
import com.aleks.fullmvcdemo.Login.models.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToMany
    private List<Book> books;
    @OneToOne(mappedBy = "shoppingCart", cascade = CascadeType.ALL)
    private Ordering ordering;
}
