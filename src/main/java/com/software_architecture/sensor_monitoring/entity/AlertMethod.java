package com.software_architecture.sensor_monitoring.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
@Entity
@Table
public class AlertMethod {
    @Id
    private String alertMethodId;
    private String methodName;

    @OneToMany(mappedBy = "alertMethod")
    private List<Alerts> alerts;

    @ManyToMany
    private List<Users> users;

    public AlertMethod() {
    }

    public AlertMethod(String alertMethodId, String methodName, List<Alerts> alerts, List<Users> users) {
        this.alertMethodId = alertMethodId;
        this.methodName = methodName;
        this.alerts = alerts;
        this.users = users;
    }

    public AlertMethod(String alertMethodId, String methodName) {
        this.alertMethodId = alertMethodId;
        this.methodName = methodName;
    }

    public String getAlertMethodId() {
        return alertMethodId;
    }

    public void setAlertMethodId(String alertMethodId) {
        this.alertMethodId = alertMethodId;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public List<Alerts> getAlert() {
        return alerts;
    }

    public void setAlert(List<Alerts> alerts) {
        this.alerts = alerts;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }
}
