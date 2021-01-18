package com.alikes;

import com.alikes.controller.*;
import com.alikes.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.lang.reflect.AnnotatedElement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            //使用配置文件创建Spring上下文,初始化所有对象
            //ClassPathXmlApplicationContext 只能获取bean xml文件在src目录下的，如果是在其他路面下则会找不到
//            AbstractApplicationContext ac = new FileSystemXmlApplicationContext("src/main/SpringConfig/applicationContext.xml");
//            parentHome parentHome = (parentHome) ac.getBean("parentHome");
//parentHome.PIndex();

            //从Spring容器中根据bean的id取出我们要使用的对象
//            Home obj = (Home) ac.getBean("myhome");
//            obj.Index();
//            obj.setMsg("77");
//            obj.Index();

//            Student obj = (Student) ac.getBean("Student");
//          System.out.println(obj.getName());

            AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
            ctx.register(Student.class,CStartEventHandler.class);
            ctx.refresh();
            ctx.start();
            Student s= ctx.getBean(Student.class);
            refclass R= ctx.getBean(refclass.class);

            s.setName("sd");
            System.out.println(s.getName());

           // R.Index();

        }
        catch (Exception e) {
            String msg= e.getMessage();
            System.out.println(msg);
        }

    }
}
