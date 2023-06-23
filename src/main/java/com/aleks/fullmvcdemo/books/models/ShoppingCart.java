package com.aleks.fullmvcdemo.books.models;
import com.aleks.fullmvcdemo.Login.models.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToMany
    private List<Book> books;
    @OneToMany(mappedBy = "shoppingCart", cascade = CascadeType.ALL)
    private List<Ordering> orderings;
    public ShoppingCart(User user){
        this.books = new ArrayList<>();
        this.orderings = new ArrayList<>();
        this.user = user;
    }
    public void addOrdering(Ordering ordering){
        if(this.orderings==null){
            this.orderings = new ArrayList<>();
        }
        this.orderings.add(ordering);
    }
    public void addBook(Book book){
        if(this.books==null){
            this.books = new ArrayList<>();
        }
        this.books.add(book);
    }
    public void removeBook(Book book){
        if(this.books==null){
            this.books = new ArrayList<>();
            return;
        }
        this.books.remove(book);
    }
}
