package com.aca.mycarfabric.properties;

import com.aca.mycarfabric.Reader;

public class InteriorPartCreator {

    public static InteriorPart createCarSeat(){

        String answer = Reader.getInput("Do you want seats in your car? Type yes or no: ");

        if (answer.equalsIgnoreCase("yes")){
            return new CarSeat();
        }else{
            return null;
        }
    }

    public static InteriorPart createStearingWheel(){

        String answer = Reader.getInput("Do you want stearing wheel in your car? Type yes or no: ");

        if (answer.equalsIgnoreCase("yes")){
            return new StearingWheel();
        }else{
            return null;
        }
    }

    public static InteriorPart createInternalMirror(){
        String answer = Reader.getInput("Do you want internal mirror in your car? Type yes or no: ");

        if (answer.equalsIgnoreCase("yes")){
            return new InternalMirror();
        }else{
            return null;
        }
    }
}
