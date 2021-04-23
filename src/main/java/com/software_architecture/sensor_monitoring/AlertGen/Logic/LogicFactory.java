package com.software_architecture.sensor_monitoring.AlertGen.Logic;

public class LogicFactory {

    public Logic getLogic(String logicName){
        if(logicName == null){
            return null;
        }

        if(logicName.equalsIgnoreCase("TE")){
            return new TempLogic();
        }
        return null;
    }
}
