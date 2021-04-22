package com.software_architecture.sensor_monitoring.repository;

import com.software_architecture.sensor_monitoring.entity.SensorValues;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<SensorValues,String> {
}
