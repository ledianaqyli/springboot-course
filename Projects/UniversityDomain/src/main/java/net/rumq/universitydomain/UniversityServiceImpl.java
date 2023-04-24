package net.rumq.universitydomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("universityService")
public class UniversityServiceImpl implements UniversityService {
    @Autowired
    public UniversityRepository universityRepository;

    @Override
    public void chooseFaculties(String name, String faculty) {
        universityRepository.information(name,faculty);

    }

    @Override
    public void payFee(String faculty, double fee) {
        universityRepository.feeInformation(faculty, fee);

    }
}
