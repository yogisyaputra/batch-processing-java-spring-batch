package com.yogisyaputra.batch.processing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * project Batch Processing - Spring Batch
 * created Monday 22/08/2022
 * author Yogi Syaputra @yogisyaputra
 */

@Entity
@Table(name = "customers_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String contactNo;
    private String country;
    private String dob;
}
