package com.java.simple.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.simple.model.Employee;

@Repository
public interface EmployeeRepositry extends JpaRepository<Employee, Integer>{

}
