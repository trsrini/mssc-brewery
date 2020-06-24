package com.skspringboot.msscbrewery.services;

import java.util.UUID;

import com.skspringboot.msscbrewery.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);

	BeerDto saveBeer(BeerDto beerDto);

	void updateBeer(UUID beerId, BeerDto beerDto);

	void deleteById(UUID beerId);

}
