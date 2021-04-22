package com.software_architecture.sensor_monitoring.service;

import com.software_architecture.sensor_monitoring.AlertGen.Logic.Logic;
import com.software_architecture.sensor_monitoring.AlertGen.Logic.LogicFactory;
import com.software_architecture.sensor_monitoring.AlertGen.Logic.LogicSelect;
import com.software_architecture.sensor_monitoring.entity.SensorValues;
import com.software_architecture.sensor_monitoring.repository.AlertRepository;
import com.software_architecture.sensor_monitoring.repository.SensorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author Lakshan
 * @since 4/22/2021
 */

@Service
@Slf4j
public class AlertService {

    @Autowired
    LogicSelect logicSelect;

    @Autowired
    SensorRepository sensorRepository;

    @Autowired
    AlertRepository alertRepository;


    public ResponseEntity validateSensorData(SensorValues sensorValues){
        Logic logic = logicSelect.selectLogicName(sensorValues.getSensorID());

        try{
            if(logic.select(sensorValues.getValue())){
                alertRepository.save(sensorValues);
            }
           return ResponseEntity.status(HttpStatus.ACCEPTED).build();
        }catch (Exception exception){
            exception.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
