package com.yogisyaputra.batch.processing;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class BatchProcessingSpringBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatchProcessingSpringBatchApplication.class, args);
    }

}
