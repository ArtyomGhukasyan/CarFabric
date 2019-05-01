package com.aca.mycarfabric.fabrics;

import com.aca.mycarfabric.cars.BusinessCar;
import com.aca.mycarfabric.cars.Car;

public class BusinessCarFabric extends SedanFabric {


    @Override
    public Car createCar() {

        BusinessCar businessCar = new BusinessCar();

        businessCar.setInteriorParts(createInteriorParts(businessCar));
        businessCar.setExteriorParts(createExteriorParts(businessCar));
        businessCar.setEngine(createEngine());
        businessCar.setWheelDriveType(choseWheelDriveType());

        //add price of car
        businessCar.addPrice(businessCar.getPrice() + businessCar.getEngine().getPrice() +
                businessCar.getPriceOfInternalAndExternalParts(businessCar.getInteriorParts(), businessCar.getExteriorParts()));

        return businessCar;
    }
}
