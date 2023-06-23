package com.learn.bean;

import lombok.ToString;

@ToString
public class Vtuber {
    String name;
    Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public Vtuber() {
        System.out.println("This is Vtuber");
    }

    public void init() {
        System.out.println("This is init()");
    }

    public void destory() {
        System.out.println("This is destory()");
    }

}
