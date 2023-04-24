package net.rumq.universitydomain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UniversityDomainApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(UniversityDomainApplication.class, args);
		Values_Bean bean = ctx.getBean(Values_Bean.class);
		System.out.println(bean);

		UniversityService universityService=ctx.getBean(UniversityService.class);
		universityService.chooseFaculties("Lediana","Business Informatics");
		universityService.payFee("Business Informatics",500);

	}

}
