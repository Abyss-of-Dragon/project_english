package com.example.project_english.mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Word_sMapper {
    @Select("SELECT english FROM word_s WHERE id=#{Id}")
    String getWengById(Integer Id);
    @Select("SELECT attribute FROM word_s WHERE id=#{Id}")
    String getWparById(Integer Id);
    @Select("SELECT chinese FROM word_s WHERE id=#{Id}")
    String getWchiById(Integer Id);
    @Select("SELECT IFNULL(MAX(id),-1) FROM word_s")
    Integer getMaxId();

    @Select("SELECT id FROM word_s")
    List<Integer> getAllId();

    @Select("SELECT id FROM word_s WHERE english=#{Weng}")
    List<Integer> search(String Weng);

    @Insert("INSERT INTO word_s FROM word WHERE id=#{Id}")
    void addWord_s(Integer Id);
    @Delete("DELETE FROM word_s WHERE id=#{Id}")
    void deleteWord_s(Integer Id);
}