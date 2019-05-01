package com.aca.mycarfabric.fabrics;

import com.aca.mycarfabric.cars.Car;
import com.aca.mycarfabric.cars.SportCar;

public class SportCarFabric extends SedanFabric {

    @Override
    public Car createCar() {

        SportCar sportCar = new SportCar();

        sportCar.setInteriorParts(createInteriorParts(sportCar));
        sportCar.setExteriorParts(createExteriorParts(sportCar));
        sportCar.setEngine(createEngine());
        sportCar.setWheelDriveType(choseWheelDriveType());

        //add price of car
        sportCar.addPrice(sportCar.getPrice() + sportCar.getEngine().getPrice() +
                sportCar.getPriceOfInternalAndExternalParts(sportCar.getInteriorParts(), sportCar.getExteriorParts()));

        return sportCar;
    }

}
