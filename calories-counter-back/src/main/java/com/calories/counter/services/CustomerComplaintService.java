package com.calories.counter.services;

import com.calories.counter.dtos.CustomerComplaint;
import com.calories.counter.repositories.CustomerComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerComplaintService {

    @Autowired
    private CustomerComplaintRepository customerComplaintRepository;

    public List<CustomerComplaint> getAllCustomerComplaints(){
        return (List<CustomerComplaint>) customerComplaintRepository.findAll();
    }

    public Optional<CustomerComplaint> getComplaintById(Integer id){
        return customerComplaintRepository.findById(id);
    }
}
