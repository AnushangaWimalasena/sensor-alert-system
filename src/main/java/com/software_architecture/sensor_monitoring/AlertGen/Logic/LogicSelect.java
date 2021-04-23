package com.software_architecture.sensor_monitoring.AlertGen.Logic;

public class LogicSelect {

    public static Logic selectLogicName(String sensorID){
        String sensor = sensorID.substring(0,2);
        LogicFactory logicFactory = new LogicFactory();

        Logic logic = logicFactory.getLogic(sensor);

        return logic;
    }
}
