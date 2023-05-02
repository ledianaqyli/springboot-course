package net.rumq.universitydomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UniversityAutowiredDI {

@Autowired
    private SciencesDepartment sciencesDepartment; //field injection
    private BusinessDepartment businessDepartment;

public UniversityAutowiredDI(BusinessDepartment businessDepartment){
    System.out.println("University Autowired DI created");
    this.businessDepartment=businessDepartment; //constructor injection
}

    @Override
    public String toString() {
        return String.format("The University has SciencesDepartment - %s , \n BusinessDepartment - %s  ",sciencesDepartment,businessDepartment);
    }
}
