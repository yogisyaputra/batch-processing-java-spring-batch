package com.yogisyaputra.batch.processing.step;

import org.springframework.batch.item.ItemProcessor;

/**
 * project Batch Processing - Spring Batch
 * created Tuesday 23/08/2022
 * author Yogi Syaputra @yogisyaputra
 */
public class Processor implements ItemProcessor<String, String> {

    @Override
    public String process(String data) throws Exception {
        return data.toUpperCase();
    }

}
