package com.yogisyaputra.batch.processing.config;

import com.yogisyaputra.batch.processing.model.Customer;
import org.springframework.batch.item.ItemProcessor;

/**
 * project Batch Processing - Spring Batch
 * created Tuesday 23/08/2022
 * author Yogi Syaputra @yogisyaputra
 */
public class CustomerProcessor implements ItemProcessor<Customer,Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
        return null;
    }
}
