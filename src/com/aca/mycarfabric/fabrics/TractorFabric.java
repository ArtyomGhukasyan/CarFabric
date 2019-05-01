package com.aca.mycarfabric.fabrics;

import com.aca.mycarfabric.cars.Car;
import com.aca.mycarfabric.cars.Tractor;

public class TractorFabric extends CarFabric {

    @Override
    public Car createCar() {

        Tractor tractor = new Tractor();

        tractor.setInteriorParts(createInteriorParts(tractor));
        tractor.setExteriorParts(createExteriorParts(tractor));
        tractor.setEngine(createEngine());
        tractor.setWheelDriveType(choseWheelDriveType());

        //add price of car
        tractor.addPrice(tractor.getPrice() + tractor.getEngine().getPrice() +
                tractor.getPriceOfInternalAndExternalParts(tractor.getInteriorParts(), tractor.getExteriorParts()));

        return tractor;
    }

}
