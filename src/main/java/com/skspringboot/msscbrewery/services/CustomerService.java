package com.skspringboot.msscbrewery.services;

import java.util.UUID;

import com.skspringboot.msscbrewery.web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerById(UUID customerId);
}
