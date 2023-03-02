package com.demo;

import com.demo.beans.SpringBean1;
import com.demo.beans.SpringBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.registerShutdownHook();
        SpringBean1 springBean1 = context.getBean(SpringBean1.class);

        springBean1.print();


        SpringBean2 springBean2 = context.getBean(SpringBean2.class);

        springBean2.print();
    }

}
