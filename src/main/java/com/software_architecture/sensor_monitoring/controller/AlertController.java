package com.software_architecture.sensor_monitoring.controller;

import com.software_architecture.sensor_monitoring.entity.SensorValues;
import com.software_architecture.sensor_monitoring.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lakshan
 * @since 4/22/2021 11:34 PM
 */

@RestController
public class AlertController {

    @Autowired
    AlertService alertService;

    @PostMapping("/data")
    public ResponseEntity getSensorData(@RequestBody SensorValues sensorValues){
       return alertService.validateSensorData(sensorValues);
    }

}
