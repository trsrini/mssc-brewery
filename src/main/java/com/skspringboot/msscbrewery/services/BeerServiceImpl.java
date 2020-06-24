package com.skspringboot.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.skspringboot.msscbrewery.web.model.BeerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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

	@Override
	public BeerDto saveBeer(BeerDto beerDto) {
		// TODO Auto-generated method stub
		return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDto beerDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(UUID beerId) {
		// TODO Auto-generated method stub
		log.debug("Deleting Beer : "+beerId);
	}	
	

}
