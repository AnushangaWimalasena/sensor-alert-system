package com.software_architecture.sensor_monitoring.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "Sensor")
public class Sensor {

    @Id
    private String sensorID;

    private String sensorName;


}
