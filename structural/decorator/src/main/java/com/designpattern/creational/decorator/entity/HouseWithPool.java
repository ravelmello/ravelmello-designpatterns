package com.designpattern.creational.decorator.entity;

import com.designpattern.creational.decorator.decorator.HouseDecorator;
import com.designpattern.creational.decorator.interfaces.House;

public class HouseWithPool extends HouseDecorator {

    public HouseWithPool(House house) {
        super(house);
    }

    @Override
    public void build() {
        super.build();
        System.out.println(", Adding a Pool");
    }
}
