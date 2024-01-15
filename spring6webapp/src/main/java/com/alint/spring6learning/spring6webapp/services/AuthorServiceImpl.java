package com.alint.spring6learning.spring6webapp.services;

import com.alint.spring6learning.spring6webapp.domain.Author;
import com.alint.spring6learning.spring6webapp.repositories.AuthorRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepo authorRepo;
    @Override
    public Iterable<Author> findAlL() {
        return authorRepo.findAll();
    }
}
