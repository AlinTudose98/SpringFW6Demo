package com.alint.spring6learning.spring6webapp.controllers;

import com.alint.spring6learning.spring6webapp.services.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    @RequestMapping("/authors")
    private String getAuthors(Model model) {
        model.addAttribute("authors",authorService.findAlL());
        return "authors";
    }
}
