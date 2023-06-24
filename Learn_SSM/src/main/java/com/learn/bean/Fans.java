package com.learn.bean;

import lombok.ToString;

@ToString
public class Fans {
    String name;
    Vtuber vtuber;

    public void setName(String name) {
        this.name = name;
    }

    public void setVtuber(Vtuber vtuber) {
        this.vtuber = vtuber;
    }
}
