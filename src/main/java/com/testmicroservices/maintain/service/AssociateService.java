package com.testmicroservices.maintain.service;

import com.testmicroservices.maintain.entities.Associate;
import com.testmicroservices.maintain.repository.AssociateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AssociateService {

    @Autowired
    private AssociateRepository associateRepo;

    public List<Associate> getAllAssociates (){
        List<Associate> associateList =  associateRepo.findAll();
		/*
		 * if(null != associateList && associateList.size()>0) { for(Associate data :
		 * associateList) { System.out.println(data); } }
		 */
        
        return associateList;
    }

    public Associate getAssociateByUsername (String username){
        Associate associate =  associateRepo.findByUsername(username);
        return associate;
    }

}
