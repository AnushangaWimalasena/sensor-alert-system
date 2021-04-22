package com.software_architecture.sensor_monitoring.AlertGen.Notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * @author Lakshan
 * @since 4/22/2021 10:44 PM
 */

@Component
public class EmailNotification implements Notification{

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void notifyToUser() throws MailException {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo();
        mailMessage.setSubject("Critical Sensor Reading Warning");
        mailMessage.setText("Please take actions");

        javaMailSender.send(mailMessage);
    }
}
