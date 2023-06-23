package com.aleks.fullmvcdemo.books.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ordering {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "shopping_cart_id")
    private ShoppingCart shoppingCart;
    @Column(nullable = false)
    private OrderingState orderingState;
    public Ordering(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
        this.orderingState = OrderingState.PENDING;
    }
}
