package com.aca.mycarfabric.fabrics;

import com.aca.mycarfabric.cars.Car;
import com.aca.mycarfabric.cars.Hetchback;

public class HetchbackFabric extends CarFabric {


    @Override
    public Car createCar() {

        Hetchback hetchback = new Hetchback();

        hetchback.setInteriorParts(createInteriorParts(hetchback));
        hetchback.setExteriorParts(createExteriorParts(hetchback));
        hetchback.setEngine(createEngine());
        hetchback.setWheelDriveType(choseWheelDriveType());

        //add price of car
        hetchback.addPrice(hetchback.getPrice() + hetchback.getEngine().getPrice() +
                hetchback.getPriceOfInternalAndExternalParts(hetchback.getInteriorParts(), hetchback.getExteriorParts()));

        return hetchback;
    }
}
