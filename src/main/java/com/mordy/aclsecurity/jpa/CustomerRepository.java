package com.mordy.aclsecurity.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mordy.aclsecurity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

	Customer findById(long id);
}