package com.learn.thymeleaf.catalog.controllers;

import com.learn.thymeleaf.catalog.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/product/{id}")
    public String getProduct(Model model, @PathVariable Integer id) {

        model.addAttribute("product", productService.getProduct(id));
        return "Product";
    }
}
