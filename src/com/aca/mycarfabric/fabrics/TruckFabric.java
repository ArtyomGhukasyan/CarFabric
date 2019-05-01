package com.aca.mycarfabric.fabrics;

import com.aca.mycarfabric.cars.Car;
import com.aca.mycarfabric.cars.Truck;

public class TruckFabric extends CarFabric {

    @Override
    public Car createCar() {

        Truck truck = new Truck();

        truck.setInteriorParts(createInteriorParts(truck));
        truck.setExteriorParts(createExteriorParts(truck));
        truck.setEngine(createEngine());
        truck.setWheelDriveType(choseWheelDriveType());

        //add price of car
        truck.addPrice(truck.getPrice() + truck.getEngine().getPrice() +
                truck.getPriceOfInternalAndExternalParts(truck.getInteriorParts(), truck.getExteriorParts()));

        return truck;
    }

}
