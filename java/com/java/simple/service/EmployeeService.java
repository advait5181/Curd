package com.java.simple.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.simple.Execption.EmployeeNotFoundException;
import com.java.simple.model.Employee;
import com.java.simple.repositry.EmployeeRepositry;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepositry employeerepositry;
	
	public List<Employee> getAllEmployee(){
		return (List<Employee>) employeerepositry.findAll();
		}

	public void saveEmployee(Employee employee) {
		employeerepositry.save(employee);
		
	}

	public void updateEmployee(Employee employee) {
		employeerepositry.save(employee);

	}

	public void deleteEmployee(Integer id) {
		employeerepositry.deleteById(id);
		
	}

	public Employee findEmployee(Integer id) {
		Optional<Employee> emp = employeerepositry.findById(id);
		Employee emp1 = null;
		if(emp.isPresent()) {
			emp1=emp.get();
		}else {
			throw new EmployeeNotFoundException("Employee not found in database"+id);
		}
		return emp.get();
		
	}
	
	
}
