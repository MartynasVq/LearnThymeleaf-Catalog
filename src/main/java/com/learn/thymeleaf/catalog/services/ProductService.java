package com.learn.thymeleaf.catalog.services;

import com.learn.thymeleaf.catalog.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);
    List<Product> listProducts();
}
