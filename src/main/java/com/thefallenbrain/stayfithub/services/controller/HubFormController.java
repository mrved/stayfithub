package com.thefallenbrain.stayfithub.services.controller;

import java.util.List;
import com.thefallenbrain.stayfithub.services.domain.ApplicationForm;
import com.thefallenbrain.stayfithub.services.domain.HubForm;
import com.thefallenbrain.stayfithub.services.repository.ApplicationFormRepository;
import com.thefallenbrain.stayfithub.services.repository.HubFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@Component
public class HubFormController {
    @Autowired
    HubFormRepository hubFormRepository;
    @PostMapping("/hub")
    HttpStatus createForm(@RequestBody HubForm hubForm){
        System.out.println(hubForm);
        hubFormRepository.save(hubForm);
        return HttpStatus.OK;
    }

    @GetMapping("/hub")
    List<HubForm> showAll(){
        return hubFormRepository.findAll();
    }
}
