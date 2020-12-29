package com.calories.counter.dtos;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "consumer_complaints")
public class CustomerComplaint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "complaint_id")
    private Integer complaintId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "sub_product")
    private String subProduct;
    @Column(name = "issue")
    private String issue;
    @Column(name = "company")
    private String company;
    @Column(name = "state_name")
    private String stateName;
    @Column(name = "zip_code")
    private String zipCode;
}
