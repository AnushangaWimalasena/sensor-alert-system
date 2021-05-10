package com.software_architecture.sensor_monitoring.repository;

import com.software_architecture.sensor_monitoring.entity.AlertMethod;
import com.software_architecture.sensor_monitoring.repository.CustomDAO.AlertMethodDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AlertMethodRepository extends JpaRepository<AlertMethod, String> {
    AlertMethodDao getAlertMethodByAlertMethodId(String id);
}
