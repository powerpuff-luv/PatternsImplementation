package com.powerpuff.factorymethod.notifications;

/**
 * Класс, реализующий отправку Email-уведомлений
 */
public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
