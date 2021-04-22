package com.software_architecture.sensor_monitoring.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "SensorValues")
public class SensorValues {

    @Id
    private String sensorID;

    private LocalDateTime date;
    private String value;

}
