package com.software_architecture.sensor_monitoring.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Component
@Entity
@Table
public class Alerts {

    @Id
    private String alertID;

    @ManyToOne()
    private AlertMethod alertMethod;

    @ManyToOne()
    private Sensor sensor;


    public Alerts(AlertMethod alertMethod, Sensor sensor) {
        this.alertID = alertMethod.getAlertMethodId().toString()+ LocalDateTime.now().toString();
        this.alertMethod = alertMethod;
        this.sensor = sensor;
    }

    public Alerts() {
    }

    public String getAlertID() {
        return alertID;
    }

    public void setAlertID(String alertID) {
        this.alertID = alertID;
    }

    public AlertMethod getAlertMethod() {
        return alertMethod;
    }

    public void setAlertMethod(AlertMethod alertMethod) {
        this.alertMethod = alertMethod;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
}
