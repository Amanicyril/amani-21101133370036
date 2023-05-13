package com.javaguides.springbootdemoapplication.service;

import com.javaguides.springbootdemoapplication.entity.stock_available;

import java.util.List;

public interface ServiceStock {
    stock_available createStock(stock_available stock);
    stock_available getstockById(Long stockId);
    List<stock_available> getAllStocks();
    stock_available updateStock(stock_available stock);
    void deleteStock(Long stockId);
}
