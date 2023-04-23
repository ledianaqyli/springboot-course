package com.example.restaurantdomain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanValues {
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
