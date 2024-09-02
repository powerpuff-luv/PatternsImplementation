package com.powerpuff.factorymethod.notifications;

/**
 * Класс, реализующий отправку SMS-уведомлений
 */
public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
