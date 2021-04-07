package com.designpattern.creational.decorator;

import com.designpattern.creational.decorator.entity.FirstFloorHouse;
import com.designpattern.creational.decorator.entity.HouseWithGarage;
import com.designpattern.creational.decorator.entity.HouseWithPool;
import com.designpattern.creational.decorator.interfaces.House;
import com.designpattern.creational.decorator.interfaces.HouseImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DecoratorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        House simpleHouse = new HouseImp();
        simpleHouse.build();
        System.out.println();

        House houseWithPool = new HouseWithPool(new HouseImp());
        houseWithPool.build();
        System.out.println();

        House houseWithGarage = new HouseWithGarage(new HouseImp());
        houseWithGarage.build();
        System.out.println();

        House houseWithFloorAndPool = new FirstFloorHouse(new HouseWithPool(new HouseImp()));
        houseWithFloorAndPool.build();
        System.out.println();

        House houseWithPoolGarageAndFloor = new HouseWithPool(new HouseWithGarage(new FirstFloorHouse(new HouseImp())));
        houseWithPoolGarageAndFloor.build();
        System.out.println();

    }
}
