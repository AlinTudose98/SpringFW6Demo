package com.alint.spring6learning.spring6webapp.repositories;

import com.alint.spring6learning.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book,Long> {
}
