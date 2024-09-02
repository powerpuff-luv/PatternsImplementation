package com.powerpuff.factorymethod.notifications;

/**
 * Интерфейс для всех типов уведомлений
 */
public interface Notification {
    void send(String message);
}
