package com.yogisyaputra.batch.processing.step;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 * project Batch Processing - Spring Batch
 * created Tuesday 23/08/2022
 * author Yogi Syaputra @yogisyaputra
 */


public class Reader implements ItemReader<String> {

    private String[] messages = { "yogisyaputra.com",
            "Welcome to Spring Batch Example"};

    private int count = 0;

    @Override
    public String read() throws Exception, UnexpectedInputException,
            ParseException, NonTransientResourceException {

        if (count < messages.length) {
            return messages[count++];
        } else {
            count = 0;
        }
        return null;
    }

}