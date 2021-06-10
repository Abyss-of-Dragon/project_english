package com.example.project_english.service;

import com.example.project_english.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateServiceImp implements UpdateService{
    @Autowired
    Word_2021Mapper word_2021Mapper;
    @Autowired
    AreaMapper areaMapper;
    @Autowired
    IrverbMapper irverbMapper;
    @Autowired
    MonthMapper monthMapper;
    @Autowired
    WeekMapper weekMapper;
    @Autowired
    NumeralMapper numeralMapper;
    @Override
    public void updateWord(Integer Id,String Weng,String Wpar,String Wchi){
        word_2021Mapper.updateWord(Id,Weng,Wpar,Wchi);
    }

    @Override
    public void updateArea(Integer Id,String area,String lang,String natnl,String natnlty){
        areaMapper.updateArea(Id,area,lang,natnl,natnlty);
    }

    @Override
    public void updateIrverb(Integer Id,String infin,String pastT,String pastP){
        irverbMapper.updateIrverb(Id,infin,pastT,pastP);
    }

    @Override
    public void updateMonth(Integer Id,String month,String month_abb){
        monthMapper.updateMonth(Id,month,month_abb);
    }

    @Override
    public void updateWeek(Integer Id,String day,String day_abb){
        weekMapper.updateWeek(Id,day,day_abb);
    }

    @Override
    public void updateNumeral(Integer Id,String cardinal,String ord_abb,String ord_num){
        numeralMapper.updateNumeral(Id,cardinal,ord_abb,ord_num);
    }
}