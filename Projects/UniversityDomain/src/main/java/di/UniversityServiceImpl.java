package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UniversityServiceImpl implements UniversityService {


    @Autowired
    private UniversityRepository universityRepository;
    @Override
    public void chooseDep(String depName) {
        System.out.println("The student has chosen the " +depName +" department");
    }
}
