package com.alikes.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class refclass {
    private  String name;

    public void  setName(String name)
    {
        this.name=name;
    }


    public  void Index()
    {
        System.out.println("A");

    }

    public  refclass(){
        System.out.println("000");
    }

    @Bean
    public  String  dddd(){
        System.out.println("INIT");
        return  "abvfd";
    }
}
