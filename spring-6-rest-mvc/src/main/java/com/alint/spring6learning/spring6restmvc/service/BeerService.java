package com.alint.spring6learning.spring6restmvc.service;

import com.alint.spring6learning.spring6restmvc.model.Beer;

import java.util.UUID;
import java.util.List;

public interface BeerService {
    public Beer getBeerById(UUID id);
    public List<Beer> listBeers();

    Beer saveNewBeer(Beer beer);
}
