package com.crm.JAMS.repository;

import com.crm.JAMS.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // You can add custom queries if necessary
}
