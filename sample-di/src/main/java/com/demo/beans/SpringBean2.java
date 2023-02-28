package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component() @Order(2)
public class SpringBean2 implements MyInterface,Ordered  {
    public SpringBean2(){
        System.out.println("Spring Bean2");
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
