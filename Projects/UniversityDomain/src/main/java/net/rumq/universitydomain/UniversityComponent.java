package net.rumq.universitydomain;

import org.springframework.stereotype.Component;

@Component("University Component")
public class UniversityComponent {
public UniversityComponent(){
    System.out.println("University Component Created");
}

    @Override
    public String toString() {
        return "University Component by toString() method";
    }
}
