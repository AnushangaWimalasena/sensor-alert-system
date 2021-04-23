package com.software_architecture.sensor_monitoring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class User {

    @Id
    private String userID;
    private String name;
    private String email;
    private String contactNo;

    @OneToMany(mappedBy = "user")
    private List<Sensor> sensors;
}
