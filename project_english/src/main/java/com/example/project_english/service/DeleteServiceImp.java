package com.example.project_english.service;

import com.example.project_english.mapper.Word_2021Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteServiceImp implements DeleteService{
    @Autowired
    Word_2021Mapper word_2021Mapper;

    @Override
    public void deleteWord(Integer Id){
        word_2021Mapper.deleteWord(Id);
    }

}
