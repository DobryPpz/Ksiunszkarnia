package com.aleks.fullmvcdemo.books.controllers;
import com.aleks.fullmvcdemo.Login.services.*;
import com.aleks.fullmvcdemo.books.models.Book;
import com.aleks.fullmvcdemo.books.services.BookService;
import com.aleks.fullmvcdemo.books.services.OrderingService;
import com.aleks.fullmvcdemo.books.services.ShoppingCartService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Controller
@RequestMapping("/user")
public class UserController {

    UserService userService;
    BookService bookService;
    OrderingService orderingService;
    ShoppingCartService shoppingCartService;

    @Autowired
    public UserController(UserService userService,
                          BookService bookService,
                          OrderingService orderingService,
                          ShoppingCartService shoppingCartService){
        this.userService = userService;
        this.bookService = bookService;
        this.orderingService = orderingService;
        this.shoppingCartService = shoppingCartService;
    }
    @GetMapping("")
    public String mainPage(Model model) {
        List<Book> books = bookService.findAll();
        model.addAttribute("books",books);
        return "user";
    }
}
