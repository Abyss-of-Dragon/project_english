package com.example.project_english.service;

import com.example.project_english.bean.Word_2021;
import com.example.project_english.mapper.Word_sMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Word_sServiceImp implements Word_sService {

    @Autowired
    Word_sMapper mapper;
    @Override
    public Word_2021 getWord_sById(Integer Id) {
        String Weng = mapper.getWengById(Id);
        String Wpar = mapper.getWparById(Id);
        String Wchi = mapper.getWchiById(Id);

        Word_2021 w=new Word_2021(Id,Weng,Wpar,Wchi);
        return w;
    }

    @Override
    public List<Word_2021> getAllWord_s() {
        List<Integer> Ids=mapper.getAllId();
        List<Word_2021> results=new ArrayList<>();
        for(Integer Id:Ids){
            results.add(getWord_sById(Id));
        }
        return results;
    }

    @Override
    public List<Word_2021> search(String key) {
        List<Integer> Ids=mapper.search(key);
        List<Word_2021> result=new ArrayList<>();
        for(Integer Id:Ids){
            result.add(getWord_sById(Id));
        }
        return result;
    }
}
