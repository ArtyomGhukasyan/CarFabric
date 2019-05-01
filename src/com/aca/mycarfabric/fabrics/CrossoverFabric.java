package com.aca.mycarfabric.fabrics;

import com.aca.mycarfabric.cars.Car;
import com.aca.mycarfabric.cars.Crossover;

public class CrossoverFabric extends CarFabric {


    @Override
    public Car createCar() {

        Crossover crossover = new Crossover();

        crossover.setInteriorParts(createInteriorParts(crossover));
        crossover.setExteriorParts(createExteriorParts(crossover));
        crossover.setEngine(createEngine());
        crossover.setWheelDriveType(choseWheelDriveType());

        //add price of car
        crossover.addPrice(crossover.getPrice() + crossover.getEngine().getPrice() +
                crossover.getPriceOfInternalAndExternalParts(crossover.getInteriorParts(), crossover.getExteriorParts()));

        return crossover;
    }
}
