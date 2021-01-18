package com.alikes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(refclass.class)
public class Student {
    private  String name;
    private  Integer age;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Bean
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

  //  @Bean(initMethod = "dddd")
    public  refclass   B(){

        return  new refclass();
    }
}
