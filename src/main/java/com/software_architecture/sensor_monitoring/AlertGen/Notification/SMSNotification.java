package com.software_architecture.sensor_monitoring.AlertGen.Notification;

/**
 * @author Lakshan
 * @since 4/22/2021 10:45 PM
 */

public class SMSNotification implements Notification {
    @Override
    public void notifyToUser() {
        System.out.println("SMS will be send to user");
    }
}
