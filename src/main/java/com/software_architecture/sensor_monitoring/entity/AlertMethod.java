package com.software_architecture.sensor_monitoring.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "AlertMethod")
public class AlertMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long alertMethodID;

    private String methodName;


}
