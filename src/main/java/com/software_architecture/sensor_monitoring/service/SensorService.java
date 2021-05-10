package com.software_architecture.sensor_monitoring.service;

import com.software_architecture.sensor_monitoring.entity.Sensor;
import com.software_architecture.sensor_monitoring.repository.SensorRepository;
import com.software_architecture.sensor_monitoring.repository.SensorsDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    private final SensorRepository sensorRepository;

    @Autowired
    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public List<Sensor> getAllSensors(){
        return sensorRepository.findAll();
    }
}
