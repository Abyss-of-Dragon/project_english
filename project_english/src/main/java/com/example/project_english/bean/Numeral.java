package com.example.project_english.bean;

public class Numeral {
    Integer Id;
    String cardinal;
    String ord_abb;
    String ord_num;

    public Numeral(Integer id, String cardinal, String ord_abb, String ord_num) {
        Id = id;
        this.cardinal = cardinal;
        this.ord_abb = ord_abb;
        this.ord_num = ord_num;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCardinal() {
        return cardinal;
    }

    public void setCardinal(String cardinal) {
        this.cardinal = cardinal;
    }

    public String getOrd_abb() {
        return ord_abb;
    }

    public void setOrd_abb(String ord_abb) {
        this.ord_abb = ord_abb;
    }

    public String getOrd_num() {
        return ord_num;
    }

    public void setOrd_num(String ord_num) {
        this.ord_num = ord_num;
    }
}
