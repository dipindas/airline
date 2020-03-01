package com.sample.airline.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.sample.airline.Exception.MyResourceNotFoundException;
import com.sample.airline.service.AirlineService;

@RestController
public class AirlineController {

	private AirlineService airlineService;

	public AirlineController(AirlineService airlineService) {
		this.airlineService = airlineService;
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testController() {
		throw new MyResourceNotFoundException("resource xyz not found");
		//return airlineService.getResult();
	}
}
