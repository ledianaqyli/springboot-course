package di;

import org.springframework.stereotype.Component;

@Component
public class UniversityRepositoryImpl implements UniversityRepository{
    @Override
    public void updateInformation(String department, String headOfDep) {
        System.out.println(headOfDep+" is the head of the "+department+" department.");
    }
}
