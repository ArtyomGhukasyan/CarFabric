package com.aca.mycarfabric.cars;

import com.aca.mycarfabric.properties.ExteriorPart;
import com.aca.mycarfabric.properties.InteriorPart;

import java.util.ArrayList;

public abstract class Car {

    private static double totalPrice=0;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void addPrice(double sum) {
        totalPrice += sum;
    }

    public double getPriceOfInternalAndExternalParts(ArrayList<InteriorPart> arrInterior, ArrayList<ExteriorPart> arrExterior){
        double totalCost = 0;

        for (InteriorPart ip : arrInterior) {
            totalCost += ip.getPrice();
        }

        for (ExteriorPart ep : arrExterior) {
            totalCost += ep.getPrice();
        }
        return totalCost;
    }

    public abstract double getPrice();

    public void addInteriorPart(InteriorPart interiorPart, ArrayList<InteriorPart> interiorList) {
        if (interiorPart != null){
            interiorList.add(interiorPart);
        }
    }

    public void addExteriorPart(ExteriorPart exteriorPart, ArrayList<ExteriorPart> exteriorList) {
        if (exteriorPart != null){
            exteriorList.add(exteriorPart);
        }
    }

}
