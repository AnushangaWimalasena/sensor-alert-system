package com.software_architecture.sensor_monitoring.repository;

import com.software_architecture.sensor_monitoring.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, String> {

}
