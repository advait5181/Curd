package com.java.simple.Execption;

public class EmployeeNotFoundException extends RuntimeException{

	String ErrorMessage;

	public EmployeeNotFoundException(String errorMessage) {
		super();
		ErrorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return ErrorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	
	
}
