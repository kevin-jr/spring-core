package com.demo.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("springbean1")
public class SpringBean1 {
    @Value("${app.name}")
    private String name;


    @Value("#{${invoice.amount} * 0.2}")
    private double invoiceDiscount;


    @Value("#{'Creek Bridge'.toUpperCase()}")
    private String street;


    @Value("#{bean2.hobby}")
    private String hobbyName;

    @Value("#{bean2.fruits.get(0)}")
    private String fruitName;
    public void print(){
        System.out.println("Name : " + name + "\n" + "Invoice Disount : " + invoiceDiscount + "\nStreet : " + street);
        System.out.println("My Hobby : " + hobbyName);
        System.out.println("Fruits : " + fruitName);

    }

    public String getName() {
        return name;
    }

    public double getInvoiceDiscount() {
        return invoiceDiscount;
    }

    public String getStreet() {
        return street;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public String getFruitName() {
        return fruitName;
    }


    //    @Autowired
//    public SpringBean1() {
//
//    }
}
