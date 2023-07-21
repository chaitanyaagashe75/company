package com.example.company.controller;

import com.example.company.model.Company;
import com.example.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Company")
public class CompanyController {

    @Autowired
    CompanyService companyService;


    @PostMapping("/add")
    private Company addCompany(@RequestBody Company company){

        return companyService.addCompany(company);
    }

    @PostMapping("/addAll")
    private List<Company> addAllCompany(@RequestBody List<Company> companies){
        return companyService.addAllCompany(companies);
    }
    @DeleteMapping("/delete/{id}")
    private Company deleteCompany(@PathVariable int id){
        return companyService.deleteCompany(id);

    }
 @GetMapping("/get/{id}")
     private Company getCompany(@PathVariable int id){
        return companyService.getCompany(id);
     }
     @GetMapping("/getall")
     private List<Company> getAllCompany(){
        return companyService.getAllCompany();
     }







}
