package com.example.project_english.service;

import com.example.project_english.bean.Irverb;
import com.example.project_english.mapper.IrverbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IrverbServiceImp implements IrverbService{
    @Autowired
    IrverbMapper mapper;
    @Override
    public Irverb getIrverbById(Integer Id) {
        String infin = mapper.getInfinById(Id);
        String pastT = mapper.getPastTById(Id);
        String pastP = mapper.getPastPById(Id);

        Irverb i=new Irverb(Id,infin,pastT,pastP);
        return i;
    }

    @Override
    public List<Irverb> getAllIrverb() {
        List<Integer> Ids=mapper.getAllId();
        List<Irverb> results=new ArrayList<>();
        for(Integer Id:Ids){
            results.add(getIrverbById(Id));
        }
        return results;
    }

    @Override
    public List<Irverb> search(String key){
        List<Integer> Ids=mapper.search(key);
        List<Irverb> result=new ArrayList<>();
        for(Integer Id:Ids){
            result.add(getIrverbById(Id));
        }
        return result;
    }

}
