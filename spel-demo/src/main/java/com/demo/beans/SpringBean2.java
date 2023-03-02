package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component("bean2")
public class SpringBean2 {

    @Value("Reading")
    public String hobby;


    @Value("${app.fruits}")
    public List<String> fruits;


    @Value("#{bean3.city}")
    private String city;

    @Value("#{${app.map}}")
    private Map<String, Integer> map;


    public void print(){
        System.out.println("City Name : " + city);
        System.out.println("Fruits from " + city + " are " + fruits);
        fruits.forEach(s->
                        System.out.println(s.toUpperCase())
                );

        System.out.println("Map are " + map);
    }

}
