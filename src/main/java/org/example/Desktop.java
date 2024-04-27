package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//We can also access Component via name you mentioned in Qualifier
//@Component("comp2")
@Component
@Primary
// There are Two type of scopes singleton and prototype
// IN Singleton , even before initialization objects are created by spring container
// In Prototype , Objects will be created only when you call them.
@Scope("prototype")
public class Desktop  implements  Computer {

    Desktop(){
        System.out.println("Desktop Object is Created...");
    }

    @Override
    public void compile() {
        System.out.println("compiling using Desktop");
    }
}

