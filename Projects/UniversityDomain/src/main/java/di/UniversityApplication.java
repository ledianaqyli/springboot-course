package di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class UniversityApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(UniversityApplication.class, args);
         UniversityService universityService=ctx.getBean(UniversityService.class);
          universityService.chooseDep("IT");
          UniversityRepository universityRepository=ctx.getBean(UniversityRepository.class);
          universityRepository.updateInformation("IT","Lediana");
    }
}
