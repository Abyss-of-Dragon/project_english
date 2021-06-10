package com.example.project_english.service;

import com.example.project_english.bean.Month;
import com.example.project_english.mapper.MonthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonthServiceImp implements MonthService{
    @Autowired
    MonthMapper mapper;
    @Override
    public Month getMonthById(Integer Id) {
        String month = mapper.getMonthById(Id);
        String month_abb = mapper.getMonth_abbById(Id);

        Month m=new Month(Id,month,month_abb);
        return m;
    }

    @Override
    public List<Month> getAllMonth() {
        List<Integer> Ids=mapper.getAllId();
        List<Month> results=new ArrayList<>();
        for(Integer Id:Ids){
            results.add(getMonthById(Id));
        }
        return results;
    }
}
