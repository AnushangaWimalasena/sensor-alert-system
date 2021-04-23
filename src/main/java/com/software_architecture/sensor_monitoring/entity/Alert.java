package com.software_architecture.sensor_monitoring.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "Alert")
public class Alert {

    @Id
    private String alertID;

    @ManyToOne
    private Sensor sensor;
}
