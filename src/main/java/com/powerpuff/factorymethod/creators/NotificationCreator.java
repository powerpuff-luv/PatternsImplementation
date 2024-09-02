package com.powerpuff.factorymethod.creators;

import com.powerpuff.factorymethod.notifications.Notification;

/**
 * Интерфейс для "создателя" уведомлений
 */
public interface NotificationCreator {
    Notification createNotification();
}
