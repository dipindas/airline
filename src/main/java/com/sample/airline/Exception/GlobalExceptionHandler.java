package com.sample.airline.Exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<Object> MyResourceNotFoundFunc(MyResourceNotFoundException e) {
		MyExceptionModel myExceptionModel = new MyExceptionModel(e.getMessage(), HttpStatus.BAD_REQUEST, ZonedDateTime.now(ZoneId.of("Z")));
		return new ResponseEntity<Object>(myExceptionModel, HttpStatus.BAD_REQUEST);
	}
}
