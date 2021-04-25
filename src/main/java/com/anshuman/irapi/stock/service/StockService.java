package com.anshuman.irapi.stock.service;


import com.anshuman.irapi.stock.model.Stock;
import com.anshuman.irapi.stock.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public Stock saveStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public List<Stock> getStocks() {
        return stockRepository.findAll();
    }

}