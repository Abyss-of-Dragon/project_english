package com.example.project_english.service;

import com.example.project_english.bean.Week;
import com.example.project_english.mapper.WeekMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeekServiceImp implements WeekService{
    @Autowired
    WeekMapper mapper;
    @Override
    public Week getWeekById(Integer Id) {
        String day = mapper.getDayById(Id);
        String day_abb = mapper.getDay_abbById(Id);

        Week w=new Week(Id,day,day_abb);
        return w;
    }

    @Override
    public List<Week> getAllWeek() {
        List<Integer> Ids=mapper.getAllId();
        List<Week> results=new ArrayList<>();
        for(Integer Id:Ids){
            results.add(getWeekById(Id));
        }
        return results;
    }
}
