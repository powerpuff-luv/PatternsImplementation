package com.powerpuff.factorymethod.creators;


import com.powerpuff.factorymethod.notifications.EmailNotification;
import com.powerpuff.factorymethod.notifications.Notification;

/**
 * Конкретный "создатель" Email-уведомлений
 */
public class EmailNotificationCreator implements NotificationCreator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
