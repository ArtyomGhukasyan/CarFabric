package com.aca.mycarfabric.fabrics;

import com.aca.mycarfabric.Reader;

public class FactoryCreator {

    public static CarFabric createFabric() {

        String type = Reader.getInput("Please choose what car do you want? Crossower," +
                " Sedan, Hetchback, Motorcycle, Truck or Tructor? Enter here: ");

        String sedanType = "";

        switch (type) {
            case "Crossower":
                return new CrossoverFabric();
            case "Sedan":
                sedanType = Reader.getInput("You chose sedan, please specify: Electric, Business or Sport: ");
                return SedanFabric.createSedanFactory(sedanType);
            case "Hetchback":
                return new HetchbackFabric();
            case "Motorcycle":
                return new MotorcycleFabric();
            case "Truck":
                return new TruckFabric();
            case "Tractor":
                return new TractorFabric();
            default:
                throw new IllegalArgumentException("wrong type inputed");
        }
    }
}
