package com.software_architecture.sensor_monitoring.AlertGen.Notification;

/**
 * @author Lakshan
 * @since 4/22/2021 10:43 PM
 */

public class PhoneCallNotification implements Notification {
    @Override
    public void notifyToUser() {
        System.out.println("Phone Call will be send to user");
    }
}
