package com.software_architecture.sensor_monitoring.repository;

import com.software_architecture.sensor_monitoring.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    
}
