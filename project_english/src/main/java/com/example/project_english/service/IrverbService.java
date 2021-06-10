package com.example.project_english.service;

import java.util.List;

import com.example.project_english.bean.Irverb;

public interface IrverbService {
    Irverb getIrverbById(Integer Id);
    List<Irverb> getAllIrverb();
}
