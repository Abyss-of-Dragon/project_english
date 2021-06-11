package com.example.project_english.service;

import com.example.project_english.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteServiceImp implements DeleteService{
    @Autowired
    Word_2021Mapper word_2021Mapper;
    @Autowired
    AreaMapper areaMapper;
    @Autowired
    IrverbMapper irverbMapper;
    @Autowired
    MonthMapper monthMapper;
    @Autowired
    NumeralMapper numeralMapper;
    @Autowired
    WeekMapper weekMapper;
    @Autowired
    Word_sMapper word_sMapper;

    @Override
    public void deleteWord(Integer Id){
        word_2021Mapper.deleteWord(Id);
    }

    @Override
    public void deleteArea(Integer Id){
        areaMapper.deleteArea(Id);
    }

    @Override
    public void deleteIrverb(Integer Id){
        irverbMapper.deleteIrverb(Id);
    }

    @Override
    public void deleteMonth(Integer Id){
        monthMapper.deleteMonth(Id);
    }

    @Override
    public void deleteNumeral(Integer Id){
        numeralMapper.deleteNumeral(Id);
    }

    @Override
    public void deleteWeek(Integer Id){
        weekMapper.deleteWeek(Id);
    }

    @Override
    public void deleteWord_s(Integer Id){
        word_sMapper.deleteWord_s(Id);
    }
}
