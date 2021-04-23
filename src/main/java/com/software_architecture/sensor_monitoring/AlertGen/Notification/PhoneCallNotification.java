package com.software_architecture.sensor_monitoring.AlertGen.Notification;

import org.springframework.stereotype.Component;

/**
 * @author Lakshan
 * @since 4/22/2021 10:43 PM
 */
@Component
public class PhoneCallNotification implements Notification {
    @Override
    public void notifyToUser() {
        System.out.println("Phone Call will be send to user");
    }
}
