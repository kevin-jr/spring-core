package com.demo.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class Person {

    private String name;
    @Autowired
    private final Address address;


    public Person(Address address) {
        this.address = address;
    }




//    @Autowired
//    public Person(Address address) {
//        this.address = address;
//        System.out.println("Constructor :: Address " + address.getClass().getSimpleName());
//    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstructor :: " + address.getClass().getSimpleName());


    }


    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                '}';
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String personInfo() {
        return name + "::" + address.getStreetName();
    }
}
