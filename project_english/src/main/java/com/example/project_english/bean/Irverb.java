package com.example.project_english.bean;

public class Irverb {
    Integer Id;
    String infin;
    String pastT;
    String pastP;

    public Irverb(Integer id, String infin, String pastT, String pastP) {
        Id = id;
        this.infin = infin;
        this.pastT = pastT;
        this.pastP = pastP;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getInfin() {
        return infin;
    }

    public void setInfin(String infin) {
        this.infin = infin;
    }

    public String getPastT() {
        return pastT;
    }

    public void setPastT(String pastT) {
        this.pastT = pastT;
    }

    public String getPastP() {
        return pastP;
    }

    public void setPastP(String pastP) {
        this.pastP = pastP;
    }
}
