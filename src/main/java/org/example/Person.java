package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    // we can also set the initial value using value annotation
    // also we can use to inject values via property files
    @Value("123")
    private String AGE ;
    private String NAME ;
    private  Computer  comp;

    public Person(){
        System.out.println("Person Object is created...");
    }
    public Person(String AGE, String NAME, Computer comp) {
        this.AGE = AGE;
        this.NAME = NAME;
        this.comp = comp;
    }

    public String getAGE() {
        return AGE;
    }

    public void setAGE(String AGE) {
        this.AGE = AGE;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Computer getComp() {
        return comp;
    }

    @Autowired
    // Qualifier is always preferred first even if you mention Primary
    @Qualifier("laptop")
    //@Qualifier("comp2")
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("coding...");
        comp.compile();
    }
}
