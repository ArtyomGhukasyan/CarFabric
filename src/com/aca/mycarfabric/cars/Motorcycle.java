package com.aca.mycarfabric.cars;

import com.aca.mycarfabric.properties.Engine;
import com.aca.mycarfabric.properties.ExteriorPart;
import com.aca.mycarfabric.properties.InteriorPart;
import com.aca.mycarfabric.properties.WheelDriveType;

import java.util.ArrayList;

public class Motorcycle extends Car {
    private double price = 7500;
    private int wheelCount = 2;
    private int seatCount = 1;
    private ArrayList<InteriorPart> interiorParts;
    private ArrayList<ExteriorPart> exteriorParts;
    private Engine engine;
    private WheelDriveType wheelDriveType;

    public void setInteriorParts(ArrayList<InteriorPart> interiorParts) {
        this.interiorParts = interiorParts;
    }

    public void setExteriorParts(ArrayList<ExteriorPart> exteriorParts) {
        this.exteriorParts = exteriorParts;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public ArrayList<InteriorPart> getInteriorParts() {
        return interiorParts;
    }

    public ArrayList<ExteriorPart> getExteriorParts() {
        return exteriorParts;
    }

    public WheelDriveType getWheelDriveType() {
        return wheelDriveType;
    }

    public void setWheelDriveType(WheelDriveType wheelDriveType) {
        this.wheelDriveType = wheelDriveType;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public int getWheelCount() {
        return wheelCount;
    }


}
