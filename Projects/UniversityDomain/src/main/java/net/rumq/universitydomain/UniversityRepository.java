package net.rumq.universitydomain;

public interface UniversityRepository {
    void information(String name,String faculty);
    void feeInformation(String faculty, double fee);
}
