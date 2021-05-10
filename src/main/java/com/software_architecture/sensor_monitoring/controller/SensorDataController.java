package com.software_architecture.sensor_monitoring.controller;

import com.software_architecture.sensor_monitoring.entity.SensorValues;
import com.software_architecture.sensor_monitoring.service.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sensor_data")
public class SensorDataController {
    private final SensorDataService sensorDataService;

    @Autowired
    public SensorDataController(SensorDataService sensorDataService) {
        this.sensorDataService = sensorDataService;
    }


    @GetMapping("/get_one_sensor_history/{id}")
    public List<SensorValues> getAllValues(@PathVariable("id") String id){
        return sensorDataService.getSensorHistory(id);
    }

    @GetMapping("/one_sensor_current_reading_/{id}")
    public SensorValues getCurrentReading(@PathVariable("id") String id){
        return sensorDataService.getCurrentReading(id);
    }

}
