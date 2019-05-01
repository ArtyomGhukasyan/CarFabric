package com.aca.mycarfabric.fabrics;

import com.aca.mycarfabric.Reader;
import com.aca.mycarfabric.cars.Car;
import com.aca.mycarfabric.properties.*;

import java.util.ArrayList;

/**
 * this class must create parts of car
 * engine, interior parts, exterior parts
 */
public abstract class CarFabric {

    public WheelDriveType choseWheelDriveType(){

        int type = Reader.getInputInt("Chose wheel drive type." +  "\n" + "type '1' for front type" +
                "\n" + "type 2 for back type" + "\n" + "type 3 for 4x4" + "\n" + "type here: ");

        switch (type){
            case 1: return WheelDriveType.FRONTWHEELDRIVE;
            case 2: return WheelDriveType.BACKWHEELDRIVE;
            case 3: return WheelDriveType.BOTHWHEELDRIWE;
            default: return null;
        }
    }

    public abstract Car createCar();

    public ArrayList<InteriorPart> createInteriorParts(Car car) {

        ArrayList<InteriorPart> list = new ArrayList<>();

        car.addInteriorPart(InteriorPartCreator.createCarSeat(), list);
        car.addInteriorPart(InteriorPartCreator.createInternalMirror(), list);
        car.addInteriorPart(InteriorPartCreator.createStearingWheel(), list);

        return list;
    }

    public ArrayList<ExteriorPart> createExteriorParts(Car car) {

        ArrayList<ExteriorPart> list = new ArrayList<>();

        car.addExteriorPart(ExteriorPartCreator.createExternalMirror(), list);
        car.addExteriorPart(ExteriorPartCreator.createSpoiler(), list);

        return list;
    }

    public Engine createEngine() {

        String enginetype = Reader.getInput("Please select engine type." + "\n" +
                "Diesel for " + new DieselEngine().getPrice() + "$" + "\n" +
                "Electrical for " + new ElectricalEngine().getPrice() + "$" + "\n" +
                "Petrol for " + new PetrolEngine().getPrice() + "$" + "\n" +
                "Hybrid for " + new HybridEngine().getPrice() + "$" + "\n" +
                "Enter here: ");

        switch (enginetype) {
            case "Diesel":
                return new DieselEngine();
            case "Electrical":
                return new ElectricalEngine();
            case "Petrol":
                return new PetrolEngine();
            case "Hybrid":
                return new HybridEngine();
            default:
                throw new IllegalArgumentException("wrong input");

        }
    }


}
