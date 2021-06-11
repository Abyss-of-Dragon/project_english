package com.example.project_english.mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MonthMapper {
    @Select("SELECT month FROM month WHERE id=#{Id}")
    String getMonthById(Integer Id);

    @Select("SELECT month_abb FROM month WHERE id=#{Id}")
    String getMonth_abbById(Integer Id);

    @Select("SELECT IFNULL(MAX(id),-1) FROM month")
    Integer getMaxId();

    @Select("SELECT id FROM month")
    List<Integer> getAllId();

    @Update("UPDATE month SET month=#{month}, month_abb=#{month_abb}, WHERE id=#{Id}")
    void updateMonth(Integer Id, String month, String month_abb);

    @Insert("INSERT INTO month VALUES(#{Id},#{month},#{month_abb})")
    void addMonth(Integer Id, String month, String month_abb);

    @Delete("DELETE FROM month WHERE id = #{Id}")
    void deleteMonth(Integer Id);
}
