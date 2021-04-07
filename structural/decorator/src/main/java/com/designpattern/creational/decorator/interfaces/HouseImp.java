package com.designpattern.creational.decorator.interfaces;

public class HouseImp implements House{
    @Override
    public void build() {
        System.out.println("Building a house");
    }
}
