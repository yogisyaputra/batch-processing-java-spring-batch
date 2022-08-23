package com.yogisyaputra.batch.processing.step;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

/**
 * project Batch Processing - Spring Batch
 * created Tuesday 23/08/2022
 * author Yogi Syaputra @yogisyaputra
 */
public class Writer implements ItemWriter<String> {

    @Override
    public void write(List<? extends String> messages) throws Exception {
        for (String msg : messages) {
            System.out.println("Writing the data " + msg);
        }
    }

}
