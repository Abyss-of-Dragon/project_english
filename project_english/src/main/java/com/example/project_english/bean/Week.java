package com.example.project_english.bean;

public class Week {
    Integer Id;
    String day;
    String day_abb;

    public Week(Integer id, String day, String day_abb) {
        Id = id;
        this.day = day;
        this.day_abb = day_abb;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay_abb() {
        return day_abb;
    }

    public void setDay_abb(String day_abb) {
        this.day_abb = day_abb;
    }
}
