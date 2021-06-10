package com.example.project_english.service;

import com.example.project_english.bean.Commit;
import com.example.project_english.bean.Word_2021;

import java.util.List;

public interface Word_2021Service {
    Word_2021 getWord_2021ById(Integer Id);
    List<Word_2021> getAllWord_2021();
    List<Word_2021> search(String key);
}
