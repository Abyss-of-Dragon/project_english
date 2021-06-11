package com.example.project_english.service;

import com.example.project_english.bean.Word_2021;

import java.util.List;

public interface Word_sService {
    Word_2021 getWord_sById(Integer Id);
    List<Word_2021> getAllWord_s();
    List<Word_2021> search(String key);
}
