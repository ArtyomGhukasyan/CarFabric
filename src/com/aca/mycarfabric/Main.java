package com.aca.mycarfabric;

import com.aca.mycarfabric.cars.Car;
import com.aca.mycarfabric.fabrics.CarFabric;
import com.aca.mycarfabric.fabrics.FactoryCreator;

public class Main {

    public static void main(String[] args) {

        CarFabric carFabric = FactoryCreator.createFabric();
        Car car = carFabric.createCar();
        System.out.println("Your car's price is " + car.getTotalPrice());
    }
}

