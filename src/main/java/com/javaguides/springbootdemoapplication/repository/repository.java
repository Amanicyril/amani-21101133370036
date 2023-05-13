package com.javaguides.springbootdemoapplication.repository;

import com.javaguides.springbootdemoapplication.entity.stock_available;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<stock_available,Long> {
}
