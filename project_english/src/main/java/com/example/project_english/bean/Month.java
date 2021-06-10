package com.example.project_english.bean;

public class Month {
    Integer Id;
    String month;
    String month_abb;

    public Month(Integer id, String month, String month_abb) {
        Id = id;
        this.month = month;
        this.month_abb = month_abb;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getMonth_abb() {
        return month_abb;
    }

    public void setMonth_abb(String month_abb) {
        this.month_abb = month_abb;
    }
}
