package com.alint.spring6learning.spring6webapp.controllers;

import com.alint.spring6learning.spring6webapp.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class BookController {
    private final BookService bookService;
    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books",bookService.findAll());

        return "books";
    }

}
