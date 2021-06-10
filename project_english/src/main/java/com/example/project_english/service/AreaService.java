package com.example.project_english.service;

import com.example.project_english.bean.Area;
import java.util.List;

public interface AreaService {
    Area getAreaById(Integer Id);
    List<Area> getAllArea();
}
