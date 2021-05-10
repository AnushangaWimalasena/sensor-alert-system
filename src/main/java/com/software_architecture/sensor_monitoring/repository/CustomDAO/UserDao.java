package com.software_architecture.sensor_monitoring.repository.CustomDAO;

import com.software_architecture.sensor_monitoring.entity.AlertMethod;
import com.software_architecture.sensor_monitoring.entity.Sensor;

import java.util.List;
import java.util.UUID;

public interface UserDao {
    public UUID getUserId();

    public List<AlertMethod> getAlertMethod();

    public String getName();

    public String getEmail();

    public String getMobileNo();

    public List<Sensor> getSensors();
}
