package com.example.project_english.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface AreaMapper {
    @Select("SELECT area FROM area WHERE id=#{Id}")
    String getAreaById(Integer Id);
    @Select("SELECT language FROM area WHERE id=#{Id}")
    String getLangById(Integer Id);
    @Select("SELECT national FROM area WHERE id=#{Id}")
    String getNatnlById(Integer Id);
    @Select("SELECT nationality FROM area WHERE id=#{Id}")
    String getNatnltyById(Integer Id);
    @Select("SELECT IFNULL(MAX(id),-1) FROM area")
    Integer getMaxId();

    @Select("SELECT id FROM area")
    List<Integer> getAllId();

    @Update("UPDATE area SET area=#{area}, language=#{lang}, nation=#{natnl}, nationality=#{natnlty} WHERE id=#{Id}")
    void updateArea(Integer Id,String area,String lang,String natnl,String natnlty);
    @Insert("INSERT INTO area VALUES(#{Id},#{area},#{lang},#{natnl},#{natnlty})")
    void addArea(Integer Id,String area,String lang,String natnl,String natnlty);
}