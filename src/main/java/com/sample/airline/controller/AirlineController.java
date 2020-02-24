package com.sample.airline.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.airline.service.AirlineService;

@RestController
public class AirlineController {
	
	private AirlineService airlineService;
	
	public AirlineController(AirlineService airlineService) {
		this.airlineService = airlineService;
	}

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String testController() {
		return airlineService.getResult();
	}
}
