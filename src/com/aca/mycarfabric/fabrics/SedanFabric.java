package com.aca.mycarfabric.fabrics;

public abstract class SedanFabric extends CarFabric {


     static CarFabric createSedanFactory(String type) {
        switch (type){
            case "Electric": return new ElectricCarFabric();
            case "Businnes": return new BusinessCarFabric();
            case "Sport": return new SportCarFabric();
            default: throw new IllegalArgumentException("wrong sedan type inputed");
        }
    }
}
