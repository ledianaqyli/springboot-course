package net.rumq.universitydomain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class UniversitySingletonScope {
    public UniversitySingletonScope(){
        System.out.println("University Singleton Scope Created "+this.hashCode());
    }

    @Override
    public String toString() {
        return "University Singleton Scope Created from toString() method "+ this.hashCode();
    }
}
