package com.yogisyaputra.batch.processing.repository;

import com.yogisyaputra.batch.processing.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * project Batch Processing - Spring Batch
 * created Monday 22/08/2022
 * author Yogi Syaputra @yogisyaputra
 */

public interface CustomerRepository  extends JpaRepository<Customer, Integer> {
}
