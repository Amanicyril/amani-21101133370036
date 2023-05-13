package com.javaguides.springbootdemoapplication.serviceImpl;

import com.javaguides.springbootdemoapplication.entity.stock_available;
import com.javaguides.springbootdemoapplication.repository.repository;
import com.javaguides.springbootdemoapplication.service.ServiceStock;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class StockServiceImpl implements ServiceStock {
    private repository myrepository;
    @Override
    public stock_available createStock(stock_available stock) {
        return myrepository.save(stock);
    }

    @Override
    public stock_available getstockById(Long stockId) {
        Optional<stock_available> stockAvailableOption=repository.findById(stockId);
        return stockAvailableOption.get();
    }

    @Override
    public List<stock_available> getAllStocks() {
        return null;
    }

    @Override
    public stock_available updateStock(stock_available stock) {
        return null;
    }

    @Override
    public void deleteStock(Long stockId) {

    }
}
