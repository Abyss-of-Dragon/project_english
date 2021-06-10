package com.example.project_english.service;

import com.example.project_english.bean.Area;
import com.example.project_english.mapper.AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AreaServiceImp implements AreaService{
    @Autowired
    AreaMapper mapper;
    @Override
    public Area getAreaById(Integer Id) {
        String area = mapper.getAreaById(Id);
        String lang = mapper.getLangById(Id);
        String natnl = mapper.getNatnlById(Id);
        String natnlty = mapper.getNatnltyById(Id);

        Area a=new Area(Id,area,lang,natnl,natnlty);
        return a;
    }

    @Override
    public List<Area> getAllArea() {
        List<Integer> Ids=mapper.getAllId();
        List<Area> results=new ArrayList<>();
        for(Integer Id:Ids){
            results.add(getAreaById(Id));
        }
        return results;
    }

}
