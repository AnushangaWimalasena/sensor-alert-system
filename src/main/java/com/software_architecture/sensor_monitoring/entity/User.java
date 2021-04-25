package com.software_architecture.sensor_monitoring.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Component
@Entity
@Table(name = "Users")
public class User {

    @Id
    private UUID userId;
    private String alertMethod;
    private String name;
    private String password;
    private String email;
    private String mobileNo;


    public User(UUID userId, String alertMethod, String name, String password, String email, String mobileNo) {
        this.userId = userId;
        this.alertMethod = alertMethod;
        this.name = name;
        this.password = password;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    public User(UUID userId) {
        this.userId = userId;
    }

    public User(){}

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getAlertMethod() {
        return alertMethod;
    }

    public void setAlertMethod(String alertMethod) {
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
}
