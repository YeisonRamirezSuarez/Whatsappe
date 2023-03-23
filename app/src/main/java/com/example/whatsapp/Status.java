package com.example.whatsapp;

public class Status {
    private String title;
    private String lastMessage;
    private String lastMessageTime;

    public Status(String title, String lastMessage, String lastMessageTime) {
        this.title = title;
        this.lastMessage = lastMessage;
        this.lastMessageTime = lastMessageTime;
    }

    public String getTitle() {
        return title;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public String getLastMessageTime() {
        return lastMessageTime;
    }
}
