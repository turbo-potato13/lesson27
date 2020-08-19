package com.geekbrains.book.store.controllers;

import com.geekbrains.book.store.beans.Statistics;
import com.geekbrains.book.store.entities.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/statistics")
@AllArgsConstructor
public class StatisticsController {
    private Statistics statistics;

    @GetMapping
    public String getStatistics(Model model) {
        model.addAttribute("bookService", statistics.getCountBookService());
        model.addAttribute("orderService", statistics.getCountOrderService());
        model.addAttribute("userService", statistics.getCountUserService());
        return "statistics-page";
    }
}
