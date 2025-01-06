package com.example.Inventory_Management_Demo.repository;

import com.example.Inventory_Management_Demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

