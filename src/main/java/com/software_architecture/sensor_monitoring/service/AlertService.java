package com.software_architecture.sensor_monitoring.service;

import com.software_architecture.sensor_monitoring.AlertGen.Logic.Logic;
import com.software_architecture.sensor_monitoring.AlertGen.Logic.LogicSelect;
import com.software_architecture.sensor_monitoring.AlertGen.Notification.EmailNotification;
import com.software_architecture.sensor_monitoring.AlertGen.Notification.PhoneCallNotification;
import com.software_architecture.sensor_monitoring.AlertGen.Notification.SMSNotification;
import com.software_architecture.sensor_monitoring.entity.Sensor;
import com.software_architecture.sensor_monitoring.entity.SensorValues;
import com.software_architecture.sensor_monitoring.repository.AlertRepository;
import com.software_architecture.sensor_monitoring.repository.SensorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    @Autowired
    EmailNotification emailNotification;

    @Autowired
    PhoneCallNotification phoneCallNotification;

    @Autowired
    SMSNotification smsNotification;


    public ResponseEntity validateSensorData(SensorValues sensorValues){
        Logic logic = logicSelect.selectLogicName(sensorValues.getSensorValueID());

        try{
            if(logic.select(sensorValues.getValue())){
                String sensorID = sensorValues.getSensorValueID();
                 Optional<Sensor> sensor =  sensorRepository.findById(sensorID);
                emailNotification.notifyToUser("lakshanviranga0000@gmail.com");
                phoneCallNotification.notifyToUser("010101");
                smsNotification.notifyToUser("101010");
                alertRepository.save(sensorValues);
            }
           return ResponseEntity.status(HttpStatus.ACCEPTED).build();
        }catch (Exception exception){
            exception.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
