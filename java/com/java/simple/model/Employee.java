package com.java.simple.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	private Integer id;
	private String name;
	private String salary;
	private String emailid;
	private String deptid;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Employee(Integer id, String name, String salary, String emailid, String deptid) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.emailid = emailid;
		this.deptid = deptid;
	}




	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getDeptid() {
		return deptid;
	}
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	
	
	
	
}
