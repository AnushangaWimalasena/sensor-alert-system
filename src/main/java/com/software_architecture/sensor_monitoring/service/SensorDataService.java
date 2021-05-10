package com.software_architecture.sensor_monitoring.service;

import com.software_architecture.sensor_monitoring.entity.Sensor;
import com.software_architecture.sensor_monitoring.entity.SensorValues;
import com.software_architecture.sensor_monitoring.repository.SensorRepository;
import com.software_architecture.sensor_monitoring.repository.SensorsDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lakshan
 * @since 4/22/2021
 */
@Service
public class SensorDataService {
    private final SensorsDataRepository sensorsDataRepository;
    private final SensorRepository sensorRepository;

    @Autowired
    public SensorDataService(SensorsDataRepository sensorsDataRepository, SensorRepository sensorRepository) {
        this.sensorsDataRepository = sensorsDataRepository;
        this.sensorRepository = sensorRepository;
    }

    public List<SensorValues> getSensorHistory(String id){
        Pageable lastTen =  PageRequest.of(0, 20);
        return sensorsDataRepository.findSensorValuesBySensorValueIDOrderByDateDesc(id, lastTen);
    }

    public SensorValues getCurrentReading(String id){
        Pageable lastOne = PageRequest.of(0,1);
        List<SensorValues> l = sensorsDataRepository.findSensorValuesBySensorValueIDOrderByDateDesc(id, lastOne);
        return l.get(0);
    }


}
