package net.rumq.universitydomain;

import org.springframework.stereotype.Component;

@Component
public class SciencesDepartment {

    public SciencesDepartment(){
        System.out.println("Sciences Department Created");
    }

    @Override
    public String toString() {
        return "Sciences Department Created from toString()";
    }
}
