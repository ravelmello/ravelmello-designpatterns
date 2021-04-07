package com.ravel.designpatterns.creationals.factory;

import com.ravel.designpatterns.creationals.interfaces.Product;

public abstract class ProductFactory {

    public void makeProduct(){
        Product product = createProduct();
        product.doSomething();
    }

    protected abstract Product createProduct();
}
