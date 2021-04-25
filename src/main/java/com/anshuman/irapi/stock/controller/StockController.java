package com.anshuman.irapi.stock.controller;


import com.anshuman.irapi.stock.model.Stock;
import com.anshuman.irapi.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @PostMapping("/stocks")
    public ResponseEntity<Stock> addStock(Stock stock) {
        return new ResponseEntity<>(stockService.saveStock(stock), HttpStatus.CREATED);
    }

    @GetMapping("/stocks")
    public ResponseEntity<List<Stock>> getStocks() {
        return new ResponseEntity<>(stockService.getStocks(),HttpStatus.OK);
    }

}