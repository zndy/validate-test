package org.johnny.test.controller;

import org.johnny.test.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.validation.ConstraintViolation;
import javax.validation.Path;
import javax.validation.Validator;
import java.util.Set;

@Controller
public class MyController {

    @Autowired
    private Validator validator;

    public void printProduct(Product product) {
        Set<ConstraintViolation<Product>> violations = validator.validate(product);
        for (ConstraintViolation<Product> violation : violations) {
            String message = violation.getMessage();
            Path path = violation.getPropertyPath();
            System.err.println(path + " " + message);
        }
    }

}
