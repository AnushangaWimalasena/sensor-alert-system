package com.software_architecture.sensor_monitoring.repository;

import com.software_architecture.sensor_monitoring.entity.Sensor;
import com.software_architecture.sensor_monitoring.repository.CustomDAO.SensorDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, String> {
//    @Query(value = "SELECT s.sensorID, s.sensorName FROM Sensor s")
//    List<SensorsDao> getAll();
//
//    @Query(value = "SELECT s.sensorID, s.sensorName FROM Sensor s WHERE s.sensorID=:id")
//    Sensor findsensvalue(@Param("id") String id);

    SensorDao findBySensorID(String id);

    List<SensorDao> findSensorsByUsers_Email(String email);
}
