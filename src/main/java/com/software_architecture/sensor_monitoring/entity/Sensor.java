package com.software_architecture.sensor_monitoring.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
@Entity
@Table(name = "Sensor")
public class Sensor {

    @Id
    private String sensorID;

    private String sensorName;

    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;

    @OneToMany(mappedBy = "sensor")
    private List<SensorValues> sensorValues;

    @OneToMany(mappedBy = "sensor")
    private List<Alert> alerts;
}
