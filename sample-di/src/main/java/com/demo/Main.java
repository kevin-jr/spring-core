package com.demo;

import com.demo.beans.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        Knight knight = context.getBean(Knight.class);

        System.out.println(knight.goQuest());



//        knight.setQuest(new RescuingDimselQuest());
//        System.out.println(knight.goQuest());
//        knight.setQuest(new SlayingDragonQuest());
//        System.out.println(knight.goQuest());
//        knight.setQuest(new SingYoYeYo());
//        System.out.println(knight.goQuest());
//        knight.setQuest(new GreatMartimonyQuest());
//        System.out.println(knight.goQuest());
    }
}
