package com.demo.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component @Scope("prototype")
public class SpringBean1 {

    private static int count;

    public SpringBean1() {
        System.out.println("Spring Beaan1 Constructor.");
        count++;
    }

    public static int getCount(){
        return count;
    }
}
