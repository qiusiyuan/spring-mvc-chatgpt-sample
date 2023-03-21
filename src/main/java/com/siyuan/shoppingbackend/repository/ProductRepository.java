package com.siyuan.shoppingbackend.repository;

import com.siyuan.shoppingbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Add custom queries here if needed
}
