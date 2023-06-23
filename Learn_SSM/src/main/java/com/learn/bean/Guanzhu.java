package com.learn.bean;

import lombok.ToString;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@ToString
public class Guanzhu {
    String title;
    Vtuber vtuber;
    List<String> fans;
    Map<String, Double> award;
    Father reborn;
    Son shit;

    public Guanzhu(String title) {
        this.title = title;
    }

    public void setShit(Son shit) {
        this.shit = shit;
    }

    public void setReborn(Father reborn) {
        this.reborn = reborn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVtuber(Vtuber vtuber) {
        this.vtuber = vtuber;
    }

    public void setFans(List<String> fans) {
        this.fans = fans;
    }

    public void setAward(Map<String, Double> award) {
        this.award = award;
    }

}
