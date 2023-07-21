package com.example.company.repository;

import com.example.company.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CompanyRepository extends MongoRepository<Company,Integer> {
    List<Company> findById(List<Company> company);

    public Company deleteCompanyById(int id);
}
