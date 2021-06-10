package com.example.project_english.service;

import java.util.List;

import com.example.project_english.bean.Month;

public interface MonthService {
    Month getMonthById(Integer Id);
    List<Month> getAllMonth();
}
