package com.alint.spring6learning.spring6webapp.services;

import com.alint.spring6learning.spring6webapp.domain.Book;
import com.alint.spring6learning.spring6webapp.repositories.BookRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    private final BookRepo bookRepo;

    @Override
    public Iterable<Book> findAll() {
        return bookRepo.findAll();
    }
}
