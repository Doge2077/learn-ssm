package com.learn;

import com.learn.bean.*;
import com.learn.congfig.mainConfiguration01;
import com.learn.congfig.mainConfiguration02;
import com.learn.congfig.mainConfiguration03;
import com.learn.mappers.testMapper;
import com.learn.service.testService;
import com.learn.service.testServiceImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//public class Main {
//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//
////        // 创建实体类 Vtuber 对象
////        Vtuber v1 = (Vtuber) context.getBean("vtuber");
////        Vtuber v2 = context.getBean(Vtuber.class);
////        System.out.println(v1 + "\n" + v2 );
////
////        context.close(); // 调用容器关闭方法，触发销毁方法的执行 仅适用于单例模式下
////        /*
////        Vtuber 类的作用域是 prototype 时，即每次获取该 bean 都会创建一个新的对象，而在该作用域下，容器不会管理 bean 的生命周期，也就不会调用其销毁方法 destory()。
////        */
//
////        Vtuber v = context.getBean(Vtuber.class);
////        System.out.println(v);  // 注入了 name 初始值 Hiiro
//
////        Guanzhu guanzhu = context.getBean(Guanzhu.class);
////        System.out.println(guanzhu);
//
//        Vtuber v = context.getBean(Vtuber.class);
//        v.speak("I'm Hiiro vtuber, nice to meet you ~~~");
//        System.out.println(v.getClass());
//
//    }
//}


public class Main {
    public static void main (String[] args) {
//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(mainConfiguration01.class);
//
////        Vtuber v = annotationConfigApplicationContext.getBean(Vtuber.class);
////        System.out.println(v);
//
//        Fans fan = annotationConfigApplicationContext.getBean(Fans.class);
//        System.out.println(fan);

//        AnnotationConfigApplicationContext beans = new AnnotationConfigApplicationContext(mainConfiguration02.class);
//
//        reVtuber v = beans.getBean(reVtuber.class);
//        System.out.println(v);

//        AnnotationConfigApplicationContext beans = new AnnotationConfigApplicationContext(mainConfiguration02.class);
//        SqlSessionTemplate template = beans.getBean(SqlSessionTemplate.class);
//        testMapper mapper = template.getMapper(testMapper.class);
//        System.out.println(mapper.getStudentBySid(1));


        AnnotationConfigApplicationContext beans = new AnnotationConfigApplicationContext(mainConfiguration03.class);
        testService service = beans.getBean(testService.class);
        System.out.println(service.getStudentBySid(1));

//        AnnotationConfigApplicationContext beans = new AnnotationConfigApplicationContext(mainConfiguration03.class);
//        testMapper mapper = beans.getBean(testMapper.class);
//        System.out.println(mapper.getStudentBySid(1));

    }
}
