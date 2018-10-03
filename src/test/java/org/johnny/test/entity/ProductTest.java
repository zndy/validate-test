package org.johnny.test.entity;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.Valid;

@SpringBootTest
public class ProductTest {
    @Test
    public void test() {
        Product product = new Product();
        printProduct(product);
    }

    private void printProduct(@Valid Product product) {
        System.out.println("product = " + product);
    }
}
