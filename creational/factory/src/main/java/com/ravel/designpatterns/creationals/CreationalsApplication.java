package com.ravel.designpatterns.creationals;

import com.ravel.designpatterns.creationals.factory.ProductFactory;
import com.ravel.designpatterns.creationals.factory.SomeProduct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreationalsApplication implements CommandLineRunner{

    private static ProductFactory productFactory;

    public static void main(String[] args) {
        SpringApplication.run(CreationalsApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        productFactory = new SomeProduct();
        productFactory.makeProduct();
        System.out.println(productFactory);
    }
}
