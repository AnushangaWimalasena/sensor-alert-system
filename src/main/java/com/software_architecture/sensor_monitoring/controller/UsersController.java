package com.software_architecture.sensor_monitoring.controller;

import com.software_architecture.sensor_monitoring.entity.Users;
import com.software_architecture.sensor_monitoring.repository.UserRepository;
import com.software_architecture.sensor_monitoring.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Anushanga
 * @since 4/25/2021 2:10 PM
 */

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserServices userServices;

   /* @Autowired
    public UsersController(UserRepository userRepository, UserServices userServices) {
        this.userRepository = userRepository;
        this.userServices = userServices;
    }*/

    @GetMapping("/all_users")
    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/get_one/{id}")
    public Optional<Users> getOneUser(@PathVariable("id") UUID id){
        return userRepository.findById(id);
    }

    @GetMapping("/get_by_email/{e}")
    public Users getByEmail(@PathVariable("e") String email){
        return userServices.getUserByEmail(email);
    }
}
