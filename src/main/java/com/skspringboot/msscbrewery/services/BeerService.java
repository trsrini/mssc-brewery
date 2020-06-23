package com.skspringboot.msscbrewery.services;

import java.util.UUID;

import com.skspringboot.msscbrewery.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);

}
