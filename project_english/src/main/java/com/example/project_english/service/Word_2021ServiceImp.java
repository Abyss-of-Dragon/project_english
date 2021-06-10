package com.example.project_english.service;

import com.example.project_english.bean.Word_2021;
import com.example.project_english.mapper.Word_2021Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Word_2021ServiceImp implements Word_2021Service {

    @Autowired
    Word_2021Mapper mapper;
    @Override
    public Word_2021 getWord_2021ById(Integer Id) {
        String Weng = mapper.getWengById(Id);
        String Wpar = mapper.getWparById(Id);
        String Wchi = mapper.getWchiById(Id);

        Word_2021 w=new Word_2021(Id,Weng,Wpar,Wchi);
        return w;
    }

    @Override
    public List<Word_2021> getAllWord_2021() {
        List<Integer> Ids=mapper.getAllId();
        List<Word_2021> results=new ArrayList<>();
        for(Integer Id:Ids){
            results.add(getWord_2021ById(Id));
        }
        return results;
    }

    @Override
    public List<Word_2021> search(String key) {
        List<Integer> Ids=mapper.search(key);
        List<Word_2021> result=new ArrayList<>();
        for(Integer Id:Ids){
            result.add(getWord_2021ById(Id));
        }
        return result;
    }
}
