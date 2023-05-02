package net.rumq.universitydomain;

import org.springframework.stereotype.Component;

@Component
public class BusinessDepartment {
    public BusinessDepartment(){
        System.out.println("Business Department Created");
    }

    @Override
    public String toString() {
        return "Business Department Created from toString()";
    }
}
