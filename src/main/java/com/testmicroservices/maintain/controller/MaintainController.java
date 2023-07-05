package com.testmicroservices.maintain.controller;

import com.testmicroservices.maintain.entities.Associate;
import com.testmicroservices.maintain.service.AssociateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/skill-tracker/api/v1/engineer")
public class MaintainController {

    @Autowired
    AssociateService service;

    @GetMapping("/getAllAssociates")
    public List<Associate> getAllAssociates() {
        List<Associate> associateList = service.getAllAssociates();
        if(null != associateList && associateList.size()>0) {
        	for(Associate data : associateList) {
            	System.out.println(data);
            }
        }
        return associateList;

    }

    @GetMapping("/getAssociateByID")
    public Associate getAssociateByID(@RequestParam String username) {
        Associate associate = service.getAssociateByUsername(username);
        return associate;

    }
}
