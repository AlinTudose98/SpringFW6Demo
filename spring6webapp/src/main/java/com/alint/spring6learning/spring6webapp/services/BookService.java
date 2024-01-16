package com.alint.spring6learning.spring6webapp.services;

import com.alint.spring6learning.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
