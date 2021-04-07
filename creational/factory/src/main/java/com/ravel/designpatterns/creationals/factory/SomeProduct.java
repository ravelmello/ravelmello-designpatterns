package com.ravel.designpatterns.creationals.factory;

import com.ravel.designpatterns.creationals.interfaces.ImpProductA;
import com.ravel.designpatterns.creationals.interfaces.Product;

public class SomeProduct extends ProductFactory {

    @Override
    protected Product createProduct() {
        return new ImpProductA();
    }
}
