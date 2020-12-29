package com.calories.counter.repositories;

import com.calories.counter.dtos.CustomerComplaint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerComplaintRepository extends CrudRepository<CustomerComplaint, Integer> {

}
