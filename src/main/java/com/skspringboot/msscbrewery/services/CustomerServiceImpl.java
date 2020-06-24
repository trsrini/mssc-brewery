package com.skspringboot.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.skspringboot.msscbrewery.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		// TODO Auto-generated method stub
		return CustomerDto.builder().id(UUID.randomUUID())
						.name("John Thompson")
						.build();
	}	
	
}
