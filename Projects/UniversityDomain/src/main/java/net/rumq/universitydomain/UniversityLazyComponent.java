package net.rumq.universitydomain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class UniversityLazyComponent {
    public UniversityLazyComponent(){
        System.out.println("University Lazy Component Created");
    }

    @Override
    public String toString() {
        return "University Lazy Component Created from toString()";
    }
}
