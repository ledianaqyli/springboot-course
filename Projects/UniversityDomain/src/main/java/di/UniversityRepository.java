package di;

import org.springframework.stereotype.Component;

@Component
public interface UniversityRepository {

void updateInformation(String department, String headOfDep);
}
