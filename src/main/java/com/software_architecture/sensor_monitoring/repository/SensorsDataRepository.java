package com.software_architecture.sensor_monitoring.repository;

import com.software_architecture.sensor_monitoring.entity.SensorValues;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SensorsDataRepository extends JpaRepository<SensorValues, String> {
    List<SensorValues> findSensorValuesBySensorValueIDOrderByDateDesc(String sensorValueId, Pageable limit);
}
