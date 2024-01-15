package com.alint.spring6learning.spring6webapp.repositories;

import com.alint.spring6learning.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepo extends CrudRepository<Author, Long> {

}
