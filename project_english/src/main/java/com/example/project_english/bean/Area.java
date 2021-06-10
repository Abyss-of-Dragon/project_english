package com.example.project_english.bean;

public class Area {
    Integer Id;
    String area;
    String lang;
    String natnl;
    String natnlty;

    public Area(Integer Id, String area, String lang, String natnl, String natnlty) {
        this.Id = Id;
        this.area = area;
        this.lang = lang;
        this.natnl = natnl;
        this.natnlty = natnlty;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getNatnl() {
        return natnl;
    }

    public void setNatnl(String natnl) {
        this.natnl = natnl;
    }

    public String getNatnlty() {
        return natnlty;
    }

    public void setNatnlty(String natnlty) {
        this.natnlty = natnlty;
    }
}
