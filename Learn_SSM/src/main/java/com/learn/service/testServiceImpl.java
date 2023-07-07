package com.learn.service;

import com.learn.bean.Student;
import com.learn.mappers.testMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class testServiceImpl implements testService{

    @Resource
    SqlSessionTemplate template;

    @Override
    public Student getStudentBySid(Integer sid) {
        testMapper mapper = template.getMapper(testMapper.class);
        return mapper.getStudent(sid);
    }
}
