package com.java.simple.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.java.simple.model.Employee;
import com.java.simple.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeService employeeservice;
	private Integer id;
	
	@PostMapping(value= "/createEmployee", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createEmployee(@RequestBody Employee employee) {
		employeeservice.saveEmployee(employee);
	}
	
	@GetMapping(value = "/getAllEmployee")
	public List<Employee> getAllEmployee(){
		return employeeservice.getAllEmployee();
		
	}
	
	@GetMapping(value= "/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable("id") Integer id) {
		 return employeeservice.findEmployee(id);
	}
	
	@PutMapping(value = "/updateEmployee")
	public void updateEmployeeById(@RequestBody Employee employee) {
		employeeservice.updateEmployee(employee);
	}
	
	@DeleteMapping(value = "/deleteEmployee/{id}")
	public void deleteEmployeeById(@PathVariable("id") Integer id) {
		System.out.println("id from user" + id);
		employeeservice.deleteEmployee(id);
		
		
	}
}
