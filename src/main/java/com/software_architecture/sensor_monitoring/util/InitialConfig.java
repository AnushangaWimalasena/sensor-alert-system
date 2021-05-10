package com.software_architecture.sensor_monitoring.util;

import com.software_architecture.sensor_monitoring.entity.AlertMethod;
import com.software_architecture.sensor_monitoring.entity.Sensor;
import com.software_architecture.sensor_monitoring.entity.Users;
import com.software_architecture.sensor_monitoring.repository.AlertMethodRepository;
import com.software_architecture.sensor_monitoring.repository.AlertRepository;
import com.software_architecture.sensor_monitoring.repository.SensorRepository;
import com.software_architecture.sensor_monitoring.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InitialConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository,
                                        SensorRepository sensorRepository,
                                        AlertMethodRepository alertMethodRepository){
        return args -> {
            AlertMethod method1 = new AlertMethod("TP001","TELEPHONE_1");
            AlertMethod method2 = new AlertMethod("SMS001","SMS_1");
            List<AlertMethod> l = new ArrayList<>();
            List<AlertMethod> l2 = new ArrayList<>();
            List<AlertMethod> l3 = new ArrayList<>();
            l.add(method2);
            l.add(method1);
            alertMethodRepository.saveAll(l);
            l2.add(method1);
            l3.add(method2);

            Users u1 = new Users(l2, "Anushanga", "123456789", "a@gmail.com", "017789654");
            Users u2 = new Users(l3, "Lakshan", "123456789", "b@gmail.com", "017789654");

            List<Users> users = new ArrayList<Users>();
            users.add(u1);
            users.add(u2);
            userRepository.saveAll(users);

            List<Users> users1 = userRepository.findAll();

            List<Sensor> s = new ArrayList<>();
            for (Users u: users1) {
                s.add(new Sensor("Sensor_1",u));
            }

            sensorRepository.saveAll(s);

        };
    }
}
