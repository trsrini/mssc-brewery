package com.skspringboot.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.skspringboot.msscbrewery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService{

	@Override
	public BeerDto getBeerById(UUID beerId) {
		// TODO Auto-generated method stub
		return BeerDto.builder().id(UUID.randomUUID())
							.beerName("Galaxy Cat")
							.beerStyle("Pale Ale")
							.build();
	}

}
