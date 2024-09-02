package com.powerpuff.factorymethod;

import com.powerpuff.factorymethod.creators.EmailNotificationCreator;
import com.powerpuff.factorymethod.creators.NotificationCreator;
import com.powerpuff.factorymethod.creators.SMSNotificationCreator;
import com.powerpuff.factorymethod.notifications.Notification;

/**
 * Класс, демонстрирующий использование фабричного метода
 */
public class NotificationClient {
    public static void main(String[] args) {
        NotificationCreator creator = new EmailNotificationCreator();
        Notification notification = creator.createNotification();
        notification.send("Hello via Email!");

        creator = new SMSNotificationCreator();
        notification = creator.createNotification();
        notification.send("Hello via SMS!");
    }
}
