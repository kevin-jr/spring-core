package com.demo;

import com.demo.beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        context.registerShutdownHook();

        Person person = new Person();
        person.setName("Arkar");
        System.out.println("Name : " + person.getName());
    }
}
