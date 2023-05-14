package net.rumq.universitydomain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UniversityDomainApplication {

	public static void main(String[] args) {
		//Start the Spring Boot application
		ApplicationContext ctx = SpringApplication.run(UniversityDomainApplication.class, args);

		//Get bean by type
		var beanByType= ctx.getBean(UniversityComponent.class);
		System.out.println("Bean By Type -> "+beanByType);

		//Get bean by name
         var beanByName=ctx.getBean("University Component");
		System.out.println("Bean By Name -> "+beanByName);

		//Get bean by name and type
		var beanByNameAndType=ctx.getBean("University Component",UniversityComponent.class);
		System.out.println("Bean By Name and Type -> "+beanByNameAndType);

		//Singleton scope
        var singletonScope=ctx.getBean(UniversitySingletonScope.class);
		var singletonScope2=ctx.getBean(UniversitySingletonScope.class);
		System.out.println(
				"singletonScope ->"+ singletonScope+"\n"+
				"singletonScope2 ->"+singletonScope2+"\n"+
						(singletonScope2==singletonScope)
		);

        //Lazy Annotation
		var lazyComponent=ctx.getBean(UniversityLazyComponent.class);
		System.out.println("Lazy Component -> "+lazyComponent);

		//Prototype Scope
		var prototypeScope=ctx.getBean(UniversityPrototypeScope.class);
		var prototypeScope2=ctx.getBean(UniversityPrototypeScope.class);
		System.out.println(
				"prototypeScope ->"+ prototypeScope+"\n"+
						"prototypeScope2 ->"+prototypeScope2+"\n"+
						(prototypeScope2==prototypeScope)
		);


		//Bean is Autowired /Constructor Injection
        var beanAutowired= ctx.getBean(UniversityAutowiredDI.class);
		System.out.println("DI ->"+ beanAutowired);

		//Qualifier / Collection / Map
		var qualifier=ctx.getBean(UniversityQualifierAutowiredDI.class);
		System.out.println("Qualifier ->"+ qualifier);

		//Inject Values
		var injectValues= ctx.getBean(InjectValues.class);
		System.out.println("Inject Values -> "+ injectValues);

















	}

}
