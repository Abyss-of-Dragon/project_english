package com.example.project_english.service;

import com.example.project_english.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddServiceImp implements AddService{
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
    public void addWord(String Weng,String Wpar,String Wchi){
        Integer Id = word_2021Mapper.getMaxId() + 1;
        word_2021Mapper.addWord(Id,Weng,Wpar,Wchi);
    }

    @Override
    public void addIrverb(String infin,String pastT,String pastP){
        Integer Id = areaMapper.getMaxId() + 1;
        irverbMapper.addIrverb(Id,infin,pastT,pastP);
    }

    @Override
    public void addArea(String area,String lang,String natnl,String natnlty){
        Integer Id = areaMapper.getMaxId() + 1;
        areaMapper.addArea(Id,area,lang,natnl,natnlty);
    }

    @Override
    public void addMonth(String month,String month_abb){
        Integer Id = monthMapper.getMaxId() + 1;
        monthMapper.addMonth(Id,month,month_abb);
    }

    @Override
    public void addWeek(String day,String day_abb){
        Integer Id = weekMapper.getMaxId() + 1;
        weekMapper.addWeek(Id,day,day_abb);
    }

    @Override
    public void addNumeral(String cardinal,String ord_abb,String ord_num){
        Integer Id = numeralMapper.getMaxId() + 1;
        numeralMapper.addNumeral(Id,cardinal,ord_abb,ord_num);
    }
}
