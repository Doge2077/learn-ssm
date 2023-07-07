package com.learn.mappers;

import com.learn.bean.Student;
import com.learn.bean.Vtuber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface testMapper {
    @Select("SELECT * FROM stu WHERE sid = #{sid}")
    Student getStudent(Integer sid);
}
