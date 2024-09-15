package com.springbatch.batchapp.repository;

import com.springbatch.batchapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
