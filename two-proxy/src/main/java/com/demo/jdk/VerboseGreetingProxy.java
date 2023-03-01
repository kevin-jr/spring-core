package com.demo.jdk;

public class VerboseGreetingProxy  implements Greeting{


    private FormatGreetingTarget target;


    public VerboseGreetingProxy(FormatGreetingTarget target) {
        this.target = target;

    }
    @Override
    public String greet(String name) {

        return target.greet(name) +" Hey mate! What you doing? ";
    }
}
