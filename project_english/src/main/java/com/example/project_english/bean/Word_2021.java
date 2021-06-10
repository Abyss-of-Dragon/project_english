package com.example.project_english.bean;

import java.util.List;

public class Word_2021 {
    Integer Id;
    String Weng;
    String Wpar;
    String Wchi;

    public Word_2021(Integer Id, String Weng, String Wpar, String Wchi) {
        this.Id = Id;
        this.Weng = Weng;
        this.Wpar = Wpar;
        this.Wchi = Wchi;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getWeng() {
        return Weng;
    }

    public void setWeng(String weng) {
        Weng = weng;
    }

    public String getWpar() {
        return Wpar;
    }

    public void setWpar(String wpar) {
        Wpar = wpar;
    }

    public String getWchi() {
        return Wchi;
    }

    public void setWchi(String wchi) {
        Wchi = wchi;
    }
}
