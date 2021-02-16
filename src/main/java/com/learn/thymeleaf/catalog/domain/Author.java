package com.learn.thymeleaf.catalog.domain;

import lombok.Data;

@Data
public class Author {

    private String name;
    private String lastname;
    private String imageUrl;
    private Integer id;
}
