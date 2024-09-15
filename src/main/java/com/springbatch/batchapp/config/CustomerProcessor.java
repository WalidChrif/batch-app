package com.springbatch.batchapp.config;


import com.springbatch.batchapp.entity.Customer;
import io.micrometer.common.lang.NonNull;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(@NonNull Customer customer) throws Exception {
        return customer;
    }
}
