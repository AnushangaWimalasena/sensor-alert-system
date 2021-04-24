package com.software_architecture.sensor_monitoring.AlertGen.Notification;

import org.springframework.stereotype.Component;

/**
 * @author Lakshan
 * @since 4/22/2021 10:45 PM
 */

@Component
public class SMSNotification implements Notification {
    @Override
    public void notifyToUser(String contact) {
        System.out.println("SMS will be send to user");
    }
}
