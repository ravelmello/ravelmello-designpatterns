package com.designpattern.creational.decorator.decorator;

import com.designpattern.creational.decorator.interfaces.House;

/**
 *  Class to make a "plugins" to House Interface
 */

public class HouseDecorator implements House {

    protected House house;

    public HouseDecorator(House house) {
        this.house = house;
    }

    @Override
    public void build() {
        this.house.build();
    }
}
