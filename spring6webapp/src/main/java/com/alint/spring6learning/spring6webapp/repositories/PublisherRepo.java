package com.alint.spring6learning.spring6webapp.repositories;

import com.alint.spring6learning.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepo extends CrudRepository<Publisher,Long> {
}
