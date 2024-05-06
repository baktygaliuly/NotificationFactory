package org.terenorda.main;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification emailNotification = factory.createNotification(NotificationType.EMAIL, "Hello from Email");
        emailNotification.send();

        Notification smsNotification = factory.createNotification(NotificationType.SMS, "Hello from SMS");
        smsNotification.send();

        Notification pushNotification = factory.createNotification(NotificationType.PUSH, "Hello from Push");
        pushNotification.send();
    }
}