package com.javaguides.springbootdemoapplication.controller;

import com.javaguides.springbootdemoapplication.entity.stock_available;
import com.javaguides.springbootdemoapplication.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/stockAvailable")
public class controller {


    @Autowired
    private repository Repository;

    @GetMapping
    public List<stock_available>getAllStocks()

    {
        return Repository.findAll();
    }
    @PostMapping
    public Object createStocksAvailable(@RequestBody stock_available Stock){ return Repository.save(Stock);
    }
    @DeleteMapping
    public Object StocksAvailable(@RequestBody stock_available stock){ return Repository.save(stock);
    }
    public void setRepository(repository repository) {
        Repository = repository;
    }
}
