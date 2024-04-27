package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext  context =  new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Spring container started & created above Objects for you...");
        Person person = context.getBean(Person.class);
        person.code();

        Desktop desktop = context.getBean(Desktop.class);
        person.setComp(desktop);
        person.code();

        Laptop laptop = context.getBean(Laptop.class);
        person.setComp(laptop);
        person.code();
        System.out.println(person.getAGE());


    }
}