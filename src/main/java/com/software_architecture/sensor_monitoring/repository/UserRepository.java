package com.software_architecture.sensor_monitoring.repository;

import com.software_architecture.sensor_monitoring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
