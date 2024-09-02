package com.powerpuff.factorymethod.creators;

import com.powerpuff.factorymethod.notifications.Notification;
import com.powerpuff.factorymethod.notifications.SMSNotification;

/**
 * Конкретный "создатель" SMS-уведомлений
 */
public class SMSNotificationCreator implements NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
