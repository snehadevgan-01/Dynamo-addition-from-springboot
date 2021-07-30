package com.dailycodebuffer.controller;

import com.dailycodebuffer.entity.Company;
import com.dailycodebuffer.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @PostMapping("/company")
    public Company saveEmployee(@RequestBody Company company) {
        return companyRepository.save(company);
    }

    @GetMapping("/company/{id}")
    public Company getEmployee(@PathVariable("id") String companyCode) {
        return companyRepository.getcompanyByCode(companyCode);
    }
}
