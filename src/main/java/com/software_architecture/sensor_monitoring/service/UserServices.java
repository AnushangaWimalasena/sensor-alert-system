package com.software_architecture.sensor_monitoring.service;

import com.software_architecture.sensor_monitoring.entity.Users;
import com.software_architecture.sensor_monitoring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Anushanga
 * @since 4/25/2021 2.10 PM
 */
@Service
public class UserServices {

    private UserRepository userRepository;

    @Autowired
    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users getUserByEmail(String email){
        System.out.println(userRepository.findUsersByEmail(email));
        return userRepository.findUsersByEmail(email);
    }

    public void logOut(){}
}
