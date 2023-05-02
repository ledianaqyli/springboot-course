package net.rumq.universitydomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;

@Component
public class UniversityQualifierAutowiredDI {


    @Autowired
    @Qualifier("lawDepartment")
   // @Qualifier("mathDepartment")
    private Department department1;

    @Autowired
    @Qualifier("mathDepartment")
    private Department department2;

    @Autowired
    private Collection<Department> departmentCollection;

    @Autowired
    private Map<String, Department> departmentMap;

    @Override
    public String toString() {
        return "Result of Dependency Injection " +
                "\n  Autowired department1:  " + department1.toString() +
                " \n   Type of department1 : " + department1.getClass()  +
                "\n  Autowired department2: " + department2.toString() +
                " \n   Type of department2 : " + department2.getClass()+
                " \n   Collection : "+ departmentCollection.toString() +
                "\n Map: "+departmentMap.toString();

    }
}
interface Department{
    public String getDepartment();
}

@Component
class LawDepartment implements Department{
    public LawDepartment(){
        System.out.println("Law Department Created");
    }

    @Override
    public String toString() {
        return "Hello from Law Department ";
    }

    @Override
    public String getDepartment() {
        return "Law Department";
    }
}

@Component
class MathDepartment implements Department{
    public MathDepartment(){
        System.out.println("Math Department Created");
    }

    @Override
    public String toString() {
        return "Hello from Math Department ";
    }

    @Override
    public String getDepartment() {
        return "Math Department";
    }
}