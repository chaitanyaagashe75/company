package com.example.company.service;

import com.example.company.model.Company;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CompanyService {
   public Company addCompany(Company company);

  public List<Company> addAllCompany(List<Company> companies);


   public Company deleteCompany(int id);

   public Company getCompany(int id);


   public  List<Company> getAllCompany();
}
