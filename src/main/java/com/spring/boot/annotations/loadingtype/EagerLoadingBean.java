package com.spring.boot.annotations.loadingtype;

import org.springframework.stereotype.Component;

@Component
public class EagerLoadingBean {

    public EagerLoadingBean() {
        System.out.println("EagerLoadingBean object is created!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
