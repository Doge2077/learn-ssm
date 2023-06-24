package com.learn.congfig;

import com.learn.bean.Fans;
import com.learn.bean.Vtuber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class mainConfiguration01 {

    @Bean
    @Scope("prototype")
    public Vtuber vtuber() {
        Vtuber vtuber = new Vtuber();
        vtuber.setName("Hiiro");
        return vtuber;
    }

    @Bean
    public Fans fans () {
        Fans fans = new Fans();
        fans.setName("Lys");
        fans.setVtuber(new Vtuber());
        return fans;
    }

}
