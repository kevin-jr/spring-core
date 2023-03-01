package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
    @Value("${app.invoice}")
    private int invoice;
    @Value("${app.name}")
    private String name;

    @Value("${app.vm.name}")
    private String vm;

    @Value("${JAVA_11}")
    private String javaHome;

    public void print(){

        System.out.println("Name : " + name + "\n" + "invoice : " + invoice );
        System.out.println("VM Properties : " + vm);
        System.out.println("Tmp : " + javaHome);
    }

}
