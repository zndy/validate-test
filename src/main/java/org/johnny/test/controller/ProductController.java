package org.johnny.test.controller;

import org.johnny.test.entity.Product;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @PostMapping("/add")
    public void addProduct(@Valid @RequestBody Product product) {
        System.out.println("added product: " + product);
    }
}
