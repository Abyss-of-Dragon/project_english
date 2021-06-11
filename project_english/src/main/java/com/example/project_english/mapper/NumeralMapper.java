package com.example.project_english.mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NumeralMapper {
    @Select("SELECT cardinal FROM numeral WHERE id=#{Id}")
    String getCardinalById(Integer Id);
    @Select("SELECT ordinal_abb FROM numeral WHERE id=#{Id}")
    String getOrd_abbById(Integer Id);
    @Select("SELECT ordinal_numeral FROM numeral WHERE id=#{Id}")
    String getOrd_numById(Integer Id);
    @Select("SELECT IFNULL(MAX(id),-1) FROM numeral")
    Integer getMaxId();

    @Select("SELECT id FROM numeral")
    List<Integer> getAllId();

    @Update("UPDATE numeral SET cardinal=#{cardinal}, ordinal_abb=#{ord_abb}, ordinal_numeral=#{ord_num} WHERE id=#{Id}")
    void updateNumeral(Integer Id,String cardinal,String ord_abb,String ord_num);
    @Insert("INSERT INTO numeral VALUES(#{Id},#{cardinal},#{ord_abb},#{ord_num}")
    void addNumeral(Integer Id,String cardinal,String ord_abb,String ord_num);
    @Delete("DELETE FROM numeral WHERE id = #{Id}")
    void deleteNumeral(Integer Id);
}
