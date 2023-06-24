package com.learn.bean;

import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@Component
public class reVtuber {
    String name;
    Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
