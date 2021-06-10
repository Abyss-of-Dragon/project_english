package com.example.project_english.service;

public interface UpdateService {
    void updateWord(Integer Id,String Weng,String Wpar,String Wchi);
    void updateArea(Integer Id,String area,String lang,String natnl,String natnlty);
    void updateIrverb(Integer Id,String infin,String pastT,String pastP);
    void updateMonth(Integer Id,String month,String month_abb);
    void updateWeek(Integer Id,String day,String day_abb);
    void updateNumeral(Integer Id,String cardinal,String ord_abb,String ord_num);
}
