package com.springBatch.batch.config;

import com.springBatch.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer item) throws Exception {
        //logic
        if(item.getCountry().equals("France")){
            return item;
        }
        return null;
    }
}
