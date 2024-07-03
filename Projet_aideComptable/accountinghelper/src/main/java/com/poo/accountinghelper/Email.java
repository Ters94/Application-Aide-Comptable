package com.poo.accountinghelper;

public class Email {
    private String recipient;
    private String subject;
    private String body;

    public Email(String recipient, String subject, String body) {
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
    }

    public void envoyerEmail() {
        System.out.println("Email envoyé à " + recipient + " avec pour sujet: " + subject);
    }

    // Getters and Setters
    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
