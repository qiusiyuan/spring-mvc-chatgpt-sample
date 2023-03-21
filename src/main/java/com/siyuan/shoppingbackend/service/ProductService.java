package com.siyuan.shoppingbackend.service;

import com.siyuan.shoppingbackend.model.Product;
import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(Long id);

    Product save(Product product);

    void deleteById(Long id);

    // Add more methods as needed
}
