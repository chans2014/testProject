package com.alikes.controller;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextStartedEvent;


@Configuration
public class CStartEventHandler extends ApplicationEvent {


    public CStartEventHandler(Object source) {
        super(source);
    }
    public String MyEve()
    {
        return  "fsfs";
    }
}
