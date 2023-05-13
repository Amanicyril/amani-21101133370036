package com.javaguides.springbootdemoapplication;

import com.javaguides.springbootdemoapplication.entity.stock_available;
import com.javaguides.springbootdemoapplication.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Autowired
	private repository Repository;

	@Override
	public void run(String... args) throws Exception {

		stock_available stock1=new stock_available();
		stock1.setStock_name("iron sheets");
		stock1.setStock_available("30pc");
		stock1.setStock_sold("50");
		stock1.setStock_Available_price("3,000,000");
		stock1.setStock_sold_price("5,000,000");
		Repository.save(stock1);





	}







}
