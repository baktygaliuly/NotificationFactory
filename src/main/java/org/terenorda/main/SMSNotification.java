package org.terenorda.main;

public class SMSNotification implements Notification{

    private String message;

    public SMSNotification(String message) {
        this.setMessage(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Sending a sms notification: " + this.message);
    }
}
