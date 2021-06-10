package com.example.project_english.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface WeekMapper {
    @Select("SELECT day FROM week WHERE id=#{Id}")
    String getDayById(Integer Id);
    @Select("SELECT day_abb FROM week WHERE id=#{Id}")
    String getDay_abbById(Integer Id);
    @Select("SELECT IFNULL(MAX(id),-1) FROM week")
    Integer getMaxId();

    @Select("SELECT id FROM week")
    List<Integer> getAllId();

    @Update("UPDATE week SET day=#{day}, day_abb=#{day_abb}, WHERE id=#{Id}")
    void updateWeek(Integer Id,String day,String day_abb);
    @Insert("INSERT INTO week VALUES(#{Id},#{day},#{day_abb})")
    void addWeek(Integer Id,String day,String day_abb);
}
