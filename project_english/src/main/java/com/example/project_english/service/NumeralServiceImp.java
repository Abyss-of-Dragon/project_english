package com.example.project_english.service;

import com.example.project_english.bean.Numeral;
import com.example.project_english.mapper.NumeralMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NumeralServiceImp implements NumeralService{
    @Autowired
    NumeralMapper mapper;
    @Override
    public Numeral getNumeralById(Integer Id) {
        String cardinal = mapper.getCardinalById(Id);
        String ord_abb = mapper.getOrd_abbById(Id);
        String ord_num = mapper.getOrd_numById(Id);

        Numeral n=new Numeral(Id,cardinal,ord_abb,ord_num);
        return n;
    }

    @Override
    public List<Numeral> getAllNumeral() {
        List<Integer> Ids=mapper.getAllId();
        List<Numeral> results=new ArrayList<>();
        for(Integer Id:Ids){
            results.add(getNumeralById(Id));
        }
        return results;
    }
}
