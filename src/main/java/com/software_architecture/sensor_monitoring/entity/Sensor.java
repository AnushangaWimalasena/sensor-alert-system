package com.software_architecture.sensor_monitoring.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;
import java.util.Random;

@Component
@Entity
@Table(name = "Sensor")
public class Sensor {

    @Id
    private String sensorID;

    private String sensorName;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @OneToMany(mappedBy = "sensor")
    private List<SensorValues> sensorValues;

    @OneToMany(mappedBy = "sensor")
    @JsonIgnoreProperties(value = {"alertMethod"})
    private List<Alerts> alerts;

    public Sensor() {
    }

    public Sensor(String sensorName, Users users) {
        Random rand = new Random();
        String id = String.format("%04d", rand.nextInt(10000));
        this.sensorID = "SEN"+id;
        this.sensorName = sensorName;
        this.users = users;
    }

    public Sensor(String sensorID, String sensorName, Users users, List<SensorValues> sensorValues, List<Alerts> alerts) {
        this.sensorID = sensorID;
        this.sensorName = sensorName;
        this.users = users;
        this.sensorValues = sensorValues;
        this.alerts = alerts;
    }

    public String getSensorID() {
        return sensorID;
    }

    public void setSensorID(String sensorID) {
        this.sensorID = sensorID;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public Users getUser() {
        return users;
    }

    public void setUser(Users users) {
        this.users = users;
    }

    public List<SensorValues> getSensorValues() {
        return sensorValues;
    }

    public void setSensorValues(List<SensorValues> sensorValues) {
        this.sensorValues = sensorValues;
    }

    public List<Alerts> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Alerts> alerts) {
        this.alerts = alerts;
    }
}
