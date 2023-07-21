package com.example.company.service.Impl;

import com.example.company.model.Company;
import com.example.company.repository.CompanyRepository;
import com.example.company.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
@Slf4j
@Service
public class CompanyServiceimpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;
    @Override
    public Company addCompany(Company company) {

        return companyRepository.save(company);
    }

    @Override
    public List<Company> addAllCompany(List<Company> companies) {
        List<Company> listCompany=new ArrayList<>();
       /* Iterator<Company> companyItr=companies.iterator();
        while(companyItr.hasNext()){
            Company company1=companyItr.next();
            listCompany.add(company1);
        }*/
        for(Company com:companies){
            listCompany.add(companyRepository.save(com));
        }
        return listCompany;
    }

    @Override
    public Company deleteCompany(int id) {
        if(id !=0){
         Company deletedCompany= companyRepository.deleteCompanyById(id);
           if(deletedCompany !=null){
               companyRepository.deleteById(id);
               log.info("Company with ID {} deleted succesfully",id);
           }else {
               log.info("Company with ID {} is not found", id);
           }
        }
        return null;

    }

    @Override
    public Company getCompany(int id) {
        Optional<Company> companyOptional = companyRepository.findById(id);
        if (companyOptional.isPresent()) {
            return companyOptional.get();
        }
        return null;
    }

     public List<Company> getAllCompany(){
        return  companyRepository.findAll();
     }


}
