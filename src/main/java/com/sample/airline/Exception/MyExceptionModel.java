package com.sample.airline.Exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public class MyExceptionModel {

	private String message;
	private HttpStatus httpStatus;
	private ZonedDateTime zonedDateTime;
	
	
	
	public MyExceptionModel(String message, HttpStatus httpStatus, ZonedDateTime zonedDateTime) {
		super();
		this.message = message;
		this.httpStatus = httpStatus;
		this.zonedDateTime = zonedDateTime;
	}



	public String getMessage() {
		return message;
	}



	public HttpStatus getHttpStatus() {
		return httpStatus;
	}



	public ZonedDateTime getZonedDateTime() {
		return zonedDateTime;
	}
	
	
}
