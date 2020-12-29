package com.calories.counter.controllers;

import com.calories.counter.dtos.CustomerComplaint;
import com.calories.counter.services.CustomerComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class WelcomeController {
    private static final String DEFAULT_WELCOME_RESPONSE = "Hello %s!";

    @Autowired
    private CustomerComplaintService customerComplaintService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam (value="name", defaultValue = "human") String name){
        return String.format(DEFAULT_WELCOME_RESPONSE, name);
    }

    @GetMapping("/complaints")
    public List<CustomerComplaint> getComplaints() {
        return customerComplaintService.getAllCustomerComplaints();
    }

    @GetMapping("/complaintsId")
    public CustomerComplaint getComplaintById(@RequestParam (value = "id") Integer id) {
        Optional<CustomerComplaint> optionalComplaint = customerComplaintService.getComplaintById(id);
        if (optionalComplaint.isPresent()){
            return optionalComplaint.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Complaint not found.");
        }
    }

//    @GetMapping("/complaintsId")
//    public ResponseEntity<CustomerComplaint> getComplaintById(@RequestParam (value = "id") Integer id) {
//        Optional<CustomerComplaint> optionalComplaint = customerComplaintService.getComplaintById(id);
//        if (optionalComplaint.isPresent()){
//            return new ResponseEntity(optionalComplaint.get(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity(HttpStatus.NOT_FOUND);
//        }
//    }


}
