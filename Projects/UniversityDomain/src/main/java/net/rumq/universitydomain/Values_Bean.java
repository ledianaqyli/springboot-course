package net.rumq.universitydomain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Values_Bean {
    @Value("Lediana")
    private String name;
    @Value("Business Informatics")
    private String faculty;
    @Value("500")
    private double fee;

    @Override
    public String toString() {
        return ("Bean Values ->"+ name + " "+faculty+" "+fee);
    }

}
