package com.learn.thymeleaf.catalog.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class Product {

    private Integer id;
    private String name;
    private String subtitle;
    private String description;
    private Author author;
    private BigDecimal price;
    private List<ProductCategory> categoryList = new ArrayList<>();
    private String imageUrl;

}
