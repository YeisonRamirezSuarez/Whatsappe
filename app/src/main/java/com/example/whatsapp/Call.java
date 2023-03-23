package com.example.whatsapp;

public class Call {

    private String name;
    private String time;
    private int icon;

    public Call(String name, String time, int icon) {
        this.name = name;
        this.time = time;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}