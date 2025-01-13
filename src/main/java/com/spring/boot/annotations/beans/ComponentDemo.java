package com.spring.boot.annotations.beans;

import org.springframework.stereotype.Component;

@Component
public class ComponentDemo {

    public ComponentDemo(){
        System.out.println("ComponentDemo constructor called");
    }

    public void message(){
        System.out.println("ComponentDemo object created");
    }
}
