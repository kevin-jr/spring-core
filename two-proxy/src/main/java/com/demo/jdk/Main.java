package com.demo.jdk;

import com.demo.cglib.GreetingProxy;

public class Main {
    public static void main(String[] args) {

        GreetingProxy greetingProxy =
                new GreetingProxy();
        System.out.println(greetingProxy.greet(("Kyaw")));
    }
}
