package com.software_architecture.sensor_monitoring.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "SensorValues")
public class SensorValues {

    @Id
    private String sensorValueID;

    private LocalDateTime date;

    private String data_value;

    @ManyToOne()
    @JoinColumn(name = "sensorID")
    @JsonIgnoreProperties(value = {"alerts"})
    private Sensor sensor;

    public SensorValues() {
    }


    public SensorValues(LocalDateTime date, String data_value, Sensor sensor) {
        this.sensorValueID = sensor.getSensorID().toString() + LocalDateTime.now().toString();
        this.date = date;
        this.data_value = data_value;
        this.sensor = sensor;
    }

    public String getSensorValueID() {
        return sensorValueID;
    }

    public void setSensorValueID(String sensorID) {
        this.sensorValueID = sensorID;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getData_value() {
        return data_value;
    }

    public void setData_value(String value) {
        this.data_value = value;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
}
