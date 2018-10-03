package org.johnny.test.entity;

import org.johnny.test.controller.MyController;
import org.johnny.test.exception.MyException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.Valid;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTest {
    @Autowired
    private MyController myController;
    @Test
    public void test() {
        Product product = new Product();
        printProduct(product);
    }

    private void printProduct(@Valid Product product) {
        System.out.println("product = " + product);
    }

    @Test
    public void myTest(){
        Product product = new Product();
        product.setName("a");
        product.setNr(-1);
        myController.printProduct(product);
    }

//    @Test
//    public void testMyExceptionHandler() throws MyException {
//        throw new MyException("this is a error");
//    }
}
