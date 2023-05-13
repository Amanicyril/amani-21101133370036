package com.javaguides.springbootdemoapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="stocks_table")
public class stock_available {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="stock_name")
    private String stock_name;

    @Column(name="stock_available")
    private String stock_available;

    @Column(name="stock_sold")
    private String stock_sold;

    @Column(name="stock_Available_price")
    private String stock_Available_price;

    @Column(name="stock_sold_price")
    private String stock_sold_price;

    public long getId() {
        return id;
    }



}
