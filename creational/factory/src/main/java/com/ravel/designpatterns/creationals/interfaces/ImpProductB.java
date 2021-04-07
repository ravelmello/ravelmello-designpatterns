package com.ravel.designpatterns.creationals.interfaces;

import com.ravel.designpatterns.creationals.interfaces.Product;

public class ImpProductB implements Product {
    @Override
    public void doSomething() {
        System.out.println("Estou no productB");
    }
}
