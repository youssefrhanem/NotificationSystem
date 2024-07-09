package org.rhanem.service.impl;

import org.rhanem.service.NotificationClient;

/**
 * Author: Youssef Rhanem
 * User:rhanem
 * Date:9/7/2024
 * Time:9:47 PM
 */

public class EmailNotificationClient implements NotificationClient {

    @Override
    public void sendNotification() {
        System.out.println("Email notification sent");
    }
}
