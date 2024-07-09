package org.rhanem.api;

import org.rhanem.service.NotificationClient;

/**
 * Author: Youssef Rhanem
 * User:rhanem
 * Date:9/7/2024
 * Time:9:38 PM
 */

public class NotificationAPI {

    private NotificationClient notificationClient;

    public void triggerNotifications(){
        this.notificationClient.sendNotification();
    }

    public void setNotificationClient(NotificationClient notificationClient) {
        this.notificationClient = notificationClient;
    }
}
