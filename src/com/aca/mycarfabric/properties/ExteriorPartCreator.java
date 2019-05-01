package com.aca.mycarfabric.properties;

import com.aca.mycarfabric.Reader;

public class ExteriorPartCreator {

    public static ExteriorPart createExternalMirror(){

        String answer = Reader.getInput("Do you want external mirrors in your car? Type yes or no: ");

        if (answer.equalsIgnoreCase("yes")){
            return new ExternalMirror();
        }else{
            return null;
        }
    }
    public static ExteriorPart createSpoiler(){

        String answer = Reader.getInput("Do you want spoiler in your car? Type yes or no: ");

        if (answer.equalsIgnoreCase("yes")){
            return new Spoiler();
        }else{
            return null;
        }
    }
}
