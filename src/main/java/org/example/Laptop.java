package org.example;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements  Computer{
    Laptop(){
        System.out.println("Laptop Object is Created...");
    }


    @Override
    public void compile() {
        System.out.println("Compiling using Laptop");
    }
}

