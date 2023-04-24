package net.rumq.universitydomain;

public interface UniversityService {
    void chooseFaculties(String name,String faculty);
    void payFee(String faculty, double fee);
}
