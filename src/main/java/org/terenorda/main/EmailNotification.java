package org.terenorda.main;

public class EmailNotification implements Notification{
    private String message;

    public EmailNotification(String message) {
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
        System.out.println("Sending an email notification: " + this.message);
    }
}
