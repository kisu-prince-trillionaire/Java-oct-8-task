package com.bhavna.employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {
	@Id
	private int eId;
	private String name;
	private int salary;

	public EmployeeEntity() {
	}

	public EmployeeEntity(int eId, String name, int salary) {
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + "]";
	}
}
