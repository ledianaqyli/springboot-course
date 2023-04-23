package com.example.restaurantdomain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestaurantDomainApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(RestaurantDomainApplication.class, args);
        BeanValues bean = ctx.getBean(BeanValues.class);
        System.out.println(bean);

        UniversityService universityService=ctx.getBean(UniversityService.class);
        universityService.chooseFaculties("Lediana","Business Informatics");
        universityService.payFee("Business Informatics",500);



    }

}
