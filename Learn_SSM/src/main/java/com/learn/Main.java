package com.learn;

import com.learn.bean.Vtuber;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

//        // 创建实体类 Vtuber 对象
//        Vtuber v1 = (Vtuber) context.getBean("vtuber");
//        Vtuber v2 = context.getBean(Vtuber.class);
//        System.out.println(v1 + "\n" + v2 );
//
//        context.close(); // 调用容器关闭方法，触发销毁方法的执行 仅适用于单例模式下
//        /*
//        Vtuber 类的作用域是 prototype 时，即每次获取该 bean 都会创建一个新的对象，而在该作用域下，容器不会管理 bean 的生命周期，也就不会调用其销毁方法 destory()。
//        */


    }
}

