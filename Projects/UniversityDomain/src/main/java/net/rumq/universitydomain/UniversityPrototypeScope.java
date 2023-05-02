package net.rumq.universitydomain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class UniversityPrototypeScope {
    public UniversityPrototypeScope(){
        System.out.println("University Prototype Scope "+this.hashCode());
    }

    @Override
    public String toString() {
        return "University Prototype Scope "+this.hashCode();
    }
}
