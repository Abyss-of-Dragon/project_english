package com.example.project_english.mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Word_2021Mapper {
    @Select("SELECT english FROM word WHERE id=#{Id}")
    String getWengById(Integer Id);
    @Select("SELECT attribute FROM word WHERE id=#{Id}")
    String getWparById(Integer Id);
    @Select("SELECT chinese FROM word WHERE id=#{Id}")
    String getWchiById(Integer Id);
    @Select("SELECT IFNULL(MAX(id),-1) FROM word")
    Integer getMaxId();

    @Select("SELECT id FROM word")
    List<Integer> getAllId();

    @Select("SELECT id FROM word WHERE english=#{Weng}")
    List<Integer> search(String Weng);

    @Update("UPDATE word SET english=#{Weng}, attribute=#{Wpar}, chinese=#{Wchi} WHERE id=#{Id}")
    void updateWord(Integer Id,String Weng,String Wpar,String Wchi);
    @Insert("INSERT INTO word VALUES(#{Id},#{Weng},#{Wpar},#{Wchi})")
    void addWord(Integer Id,String Weng,String Wpar,String Wchi);
    @Delete("DELETE FROM word WHERE Id = #{Id}")
    void deleteWord(Integer Id);
}
