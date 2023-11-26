package com.java.simple.Execption;


import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.java.simple.error.ErrorResponse;

@ControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity<ErrorResponse> exception(EmployeeNotFoundException exception){
		
		ErrorResponse errResp = new ErrorResponse();
		errResp.setErrorMessage(exception.getErrorMessage());
		errResp.setErrorCode(HttpStatus.NOT_FOUND.toString());
		errResp.setDate(new Date());
		return new ResponseEntity<ErrorResponse>(errResp, HttpStatus.NOT_FOUND);	
		
	} 
}
