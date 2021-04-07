package com.ravel.designpatterns.creationals.interfaces;

import com.ravel.designpatterns.creationals.interfaces.Product;

public class ImpProductA implements Product {
    @Override
    public void doSomething() {
        System.out.println("Estou no produto A");
    }
}
