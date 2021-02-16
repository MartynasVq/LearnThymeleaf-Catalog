package com.learn.thymeleaf.catalog.controllers;

import com.learn.thymeleaf.catalog.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final ProductService productService;

    public IndexController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping({"", "/", "/index", "/home"})
    public String getHomepage(Model model) {

        model.addAttribute("products", productService.listProducts());

        return "index";
    }
}
