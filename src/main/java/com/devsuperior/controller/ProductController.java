package com.devsuperior.controller;

import com.devsuperior.entities.Departament;
import com.devsuperior.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "products")
public class ProductController {

    @GetMapping
    public List<Product> getObjects() {
        Departament d1 = new Departament(1L, "Tech");
        Departament d2 = new Departament(2L, "Pet");

        Product p1 = new Product(1L, "Mac Book Pro", 4000.0, d1);
        Product p2 = new Product(2L, "PC Game", 5000.0, d1);
        Product p3 = new Product(3L, "Pet House", 300.0, d2);

        return Arrays.asList(p1, p2, p3);
    }
}
