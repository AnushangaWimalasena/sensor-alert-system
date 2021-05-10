package com.software_architecture.sensor_monitoring.repository;

import com.software_architecture.sensor_monitoring.entity.Users;
import com.software_architecture.sensor_monitoring.repository.CustomDAO.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<Users, UUID> {
    Users findByEmail(String email);
    Users findByName(String name);
    Users findUsersByEmail(String email);
}
