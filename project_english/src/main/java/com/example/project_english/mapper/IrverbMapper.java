package com.example.project_english.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface IrverbMapper {
    @Select("SELECT Infinitive FROM irregularverb WHERE id=#{Id}")
    String getInfinById(Integer Id);
    @Select("SELECT PastTense FROM irregularverb WHERE id=#{Id}")
    String getPastTById(Integer Id);
    @Select("SELECT PastParticiple FROM irregularverb WHERE id=#{Id}")
    String getPastPById(Integer Id);
    @Select("SELECT IFNULL(MAX(id),-1) FROM irregularverb")
    Integer getMaxId();

    @Select("SELECT id FROM irregularverb")
    List<Integer> getAllId();

    @Update("UPDATE irregularverb SET Infinitive=#{infin}, PastTense=#{pastT}, PastParticiple=#{PastP} WHERE id=#{Id}")
    void updateIrverb(Integer Id,String infin,String pastT,String pastP);
    @Insert("INSERT INTO irregularverb VALUES(#{Id},#{area},#{lang},#{natnl},#{natnlty})")
    void addIrverb(Integer Id,String infin,String pastT,String pastP);
}