package com.demo;

import com.demo.jdk.FormatGreetingTarget;
import com.demo.jdk.Greeting;
import com.demo.jdk.VerboseGreetingProxy;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new VerboseGreetingProxy(new FormatGreetingTarget());
        System.out.println(greeting.greet("John"));
    }
}
