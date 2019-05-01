package com.aca.mycarfabric.fabrics;

import com.aca.mycarfabric.cars.Car;
import com.aca.mycarfabric.cars.Motorcycle;

public class MotorcycleFabric extends CarFabric {

    @Override
    public Car createCar() {

        Motorcycle motorcycle = new Motorcycle();

        motorcycle.setInteriorParts(createInteriorParts(motorcycle));
        motorcycle.setExteriorParts(createExteriorParts(motorcycle));
        motorcycle.setEngine(createEngine());
        motorcycle.setWheelDriveType(choseWheelDriveType());

        //add price of car
        motorcycle.addPrice(motorcycle.getPrice() + motorcycle.getEngine().getPrice());

        return motorcycle;
    }


}
