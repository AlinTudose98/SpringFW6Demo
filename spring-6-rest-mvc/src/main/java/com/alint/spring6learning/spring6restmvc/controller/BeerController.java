package com.alint.spring6learning.spring6restmvc.controller;

import com.alint.spring6learning.spring6restmvc.model.Beer;
import com.alint.spring6learning.spring6restmvc.model.BeerStyle;
import com.alint.spring6learning.spring6restmvc.service.BeerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.List;
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/beer")
public class BeerController {
    private final BeerService beerService;


    @GetMapping("")
    public List<Beer> listBeers(){
        return beerService.listBeers();
    }

    @GetMapping("/{beerId}")
    public Beer getBeerById(@PathVariable("beerId") UUID id){
        log.debug("get Beer by Id in controller");

        return beerService.getBeerById(id);
    }

    @PostMapping()
    public ResponseEntity handlePost(@RequestBody Beer beer){
        Beer savedBeer = beerService.saveNewBeer(beer);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location","/api/v1/beer/" + savedBeer.getId().toString());
        return new ResponseEntity<>(httpHeaders,HttpStatus.CREATED);
    }

}
