package com.software_architecture.sensor_monitoring.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "SensorValues")
public class SensorValues {

    @Id
    private String sensorValueID;

    private LocalDateTime date;
    private String value;

    @ManyToOne
    @JoinColumn(name = "sensorID")
    private Sensor sensor;



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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
}
