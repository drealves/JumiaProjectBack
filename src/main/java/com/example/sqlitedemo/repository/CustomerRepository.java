package com.example.sqlitedemo.repository;

import com.example.sqlitedemo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    boolean existsByIdOrPhone(Integer id, String phone);
}
