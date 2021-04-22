package com.software_architecture.sensor_monitoring.AlertGen.Logic;

public class TempLogic implements Logic {

    @Override
    public boolean select(String value) {
        double sensorValue = Double.parseDouble(value.substring(0,value.length()-1));
        return  sensorValue > 30;
    }
}
