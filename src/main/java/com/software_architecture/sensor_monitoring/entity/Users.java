package com.software_architecture.sensor_monitoring.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Component
@Entity
@Table(name = "Users")
public class Users {

    @Id
    private UUID userId;

    @ManyToMany()
    @JsonIgnoreProperties(value = {"alert", "users"})
    private List<AlertMethod> alertMethod;
    private String name;
    private String password;
    private String email;
    private String mobileNo;

    @OneToMany(mappedBy = "users")
    @JsonIgnoreProperties(value = {"alerts","user","sensorValues"})
    private List<Sensor> sensors;

    public Users(){}

    public Users(List<AlertMethod> alertMethod, String name, String password, String email, String mobileNo) {
        this.userId = UUID.randomUUID();
        this.alertMethod = alertMethod;
        this.name = name;
        this.password = password;
        this.email = email;
        this.mobileNo = mobileNo;
    }
    public Users(List<AlertMethod> alertMethod, String name, String password, String email, String mobileNo, List<Sensor> sensors) {
        this.userId = UUID.randomUUID();
        this.alertMethod = alertMethod;
        this.name = name;
        this.password = password;
        this.email = email;
        this.mobileNo = mobileNo;
        this.sensors = sensors;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public List<AlertMethod> getAlertMethod() {
        return alertMethod;
    }

    public void setAlertMethod(List<AlertMethod> alertMethod) {
        this.alertMethod = alertMethod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }
}
