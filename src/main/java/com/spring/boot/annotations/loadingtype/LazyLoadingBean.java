package com.spring.boot.annotations.loadingtype;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyLoadingBean {

    public LazyLoadingBean() {
        System.out.println("LazyLoadingBean objected has created!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
