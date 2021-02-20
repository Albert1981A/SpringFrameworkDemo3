package com.AlbertAbuav.demo3;

import com.AlbertAbuav.demo3.beans.Cat;
import com.AlbertAbuav.demo3.beans.Person;
import com.AlbertAbuav.demo3.beans.Student;
import com.AlbertAbuav.demo3.config.MyConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo3Application {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);

        Person p1 = ctx.getBean(Person.class);
        System.out.println(p1);

        Cat c1 = ctx.getBean(Cat.class);
        System.out.println(c1);

        Student s1 = ctx.getBean(Student.class);
        System.out.println(s1);
    }

}
