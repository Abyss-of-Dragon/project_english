package com.example.project_english.service;

import java.util.List;

import com.example.project_english.bean.Numeral;

public interface NumeralService {
    Numeral getNumeralById(Integer Id);
    List<Numeral> getAllNumeral();
}
