package com.software_architecture.sensor_monitoring.controller;

import com.software_architecture.sensor_monitoring.entity.Sensor;
import com.software_architecture.sensor_monitoring.repository.CustomDAO.SensorDao;
import com.software_architecture.sensor_monitoring.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sensors")
public class SensorController {

    private SensorRepository sensorRepository;

    @Autowired
    public SensorController(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    @GetMapping("/get_one/{id}")
    public SensorDao getOneSensorDetails(@PathVariable("id") String id){
        return sensorRepository.findBySensorID(id);
    }

    @GetMapping("/get_all")
    public List<Sensor> getAllSensors(){
        return sensorRepository.findAll();
    }
}
