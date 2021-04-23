package com.software_architecture.sensor_monitoring.entity;

import javax.persistence.Entity;
import java.util.UUID;

public class User {
    private UUID userId;
    private UUID alertMethod;
    private String name;
    private String password;

    public User(UUID userId) {
        this.userId = userId;
    }

    public User(UUID userId, UUID alertMethod, String name, String password) {
        this.userId = userId;
        this.alertMethod = alertMethod;
        this.name = name;
        this.password = password;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getAlertMethod() {
        return alertMethod;
    }

    public void setAlertMethod(UUID alertMethod) {
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
}
