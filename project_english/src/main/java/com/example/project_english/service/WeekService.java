package com.example.project_english.service;

import com.example.project_english.bean.Week;
import java.util.List;

public interface WeekService {
    Week getWeekById(Integer Id);
    List<Week> getAllWeek();
}