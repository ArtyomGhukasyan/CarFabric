package com.aca.mycarfabric.fabrics;

import com.aca.mycarfabric.cars.Car;
import com.aca.mycarfabric.cars.ElectricCar;

public class ElectricCarFabric extends SedanFabric {


    @Override
    public Car createCar() {

        ElectricCar electricCar = new ElectricCar();

        electricCar.setInteriorParts(createInteriorParts(electricCar));
        electricCar.setExteriorParts(createExteriorParts(electricCar));
        electricCar.setEngine(createEngine());
        electricCar.setWheelDriveType(choseWheelDriveType());

        //add price of car
        electricCar.addPrice(electricCar.getPrice() + electricCar.getEngine().getPrice() +
                electricCar.getPriceOfInternalAndExternalParts(electricCar.getInteriorParts(), electricCar.getExteriorParts()));

        return electricCar;
    }
}
