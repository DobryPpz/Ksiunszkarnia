package com.aleks.fullmvcdemo.books.controllers;
import com.aleks.fullmvcdemo.books.models.Book;
import com.aleks.fullmvcdemo.books.models.Ordering;
import com.aleks.fullmvcdemo.books.models.OrderingState;
import com.aleks.fullmvcdemo.books.services.BookService;
import com.aleks.fullmvcdemo.books.services.OrderingService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@NoArgsConstructor
@Controller
@RequestMapping("/admin")
public class AdminController {

    BookService bookService;
    OrderingService orderingService;

    @Autowired
    public AdminController(BookService bookService,OrderingService orderingService){
        this.bookService = bookService;
        this.orderingService = orderingService;
    }

    @GetMapping("")
    public String adminPanel(Model model) {
        List<Book> books = bookService.findAll();
        model.addAttribute("books",books);
        return "admin-panel";
    }

    @GetMapping("/orderings")
    public String orderingsPanel(Model model){
        List<Ordering> orderings = orderingService.findAll();
        model.addAttribute("orderings",orderings);
        return "orderings-panel";
    }

    @GetMapping("/orderings/changeToPending")
    public String changeToPending(@ModelAttribute("orderingId") long orderingId, Model model){
        Ordering ordering = orderingService.findById(orderingId);
        ordering.setOrderingState(OrderingState.PENDING);
        orderingService.save(ordering);
        List<Ordering> orderings = orderingService.findAll();
        model.addAttribute("orderings",orderings);
        return "orderings-panel";
    }

    @GetMapping("/orderings/changeToAccepted")
    public String changeToAccepted(@ModelAttribute("orderingId") long orderingId, Model model){
        Ordering ordering = orderingService.findById(orderingId);
        ordering.setOrderingState(OrderingState.ACCEPTED);
        orderingService.save(ordering);
        List<Ordering> orderings = orderingService.findAll();
        model.addAttribute("orderings",orderings);
        return "orderings-panel";
    }

    @GetMapping("/orderings/changeToRejected")
    public String changeToRejected(@ModelAttribute("orderingId") long orderingId, Model model){
        Ordering ordering = orderingService.findById(orderingId);
        ordering.setOrderingState(OrderingState.REJECTED);
        orderingService.save(ordering);
        List<Ordering> orderings = orderingService.findAll();
        model.addAttribute("orderings",orderings);
        return "orderings-panel";
    }

    @GetMapping("/orderings/changeToSent")
    public String changeToSent(@ModelAttribute("orderingId") long orderingId, Model model){
        Ordering ordering = orderingService.findById(orderingId);
        ordering.setOrderingState(OrderingState.SENT);
        orderingService.save(ordering);
        List<Ordering> orderings = orderingService.findAll();
        model.addAttribute("orderings",orderings);
        return "orderings-panel";
    }

    @GetMapping("/showFormForAdding")
    public String showFormForAdding(Model model){
        Book book = new Book();
        model.addAttribute("book",book);
        return "add-book";
    }

    @PostMapping("/books")
    public String addNewBook(@ModelAttribute("book") Book book){
        bookService.save(book);
        return "redirect:/admin";
    }

    @GetMapping("/books/delete")
    public String deleteBook(@RequestParam("bookId") long bookId){
        bookService.deleteById(bookId);
        return "redirect:/admin";
    }
}
