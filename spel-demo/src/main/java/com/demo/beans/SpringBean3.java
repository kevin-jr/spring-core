package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bean3")
public class SpringBean3 {

    @Value("#{'Yangon'.toUpperCase()}")
    public String city;


}
