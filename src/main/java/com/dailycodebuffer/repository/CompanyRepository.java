package com.dailycodebuffer.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.dailycodebuffer.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;


    public Company save(Company company) {
        dynamoDBMapper.save(company);
        return company;
    }

    public Company getcompanyByCode(String companyCode) {
        return dynamoDBMapper.load(Company.class, companyCode);
    }

}
