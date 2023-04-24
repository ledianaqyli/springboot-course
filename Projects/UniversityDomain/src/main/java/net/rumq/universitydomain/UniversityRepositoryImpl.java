package net.rumq.universitydomain;

import org.springframework.stereotype.Repository;

@Repository
public class UniversityRepositoryImpl implements UniversityRepository {
    @Override
    public void information(String name, String faculty) {
        System.out.println(name+ " is attending "+ faculty);
    }

    @Override
    public void feeInformation(String faculty, double fee) {
        System.out.println(faculty +" has a "+fee +" euro fee that needs to be paid.");

    }
}
