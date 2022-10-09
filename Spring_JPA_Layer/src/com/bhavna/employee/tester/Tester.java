package com.bhavna.employee.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavna.employee.dao.EmployeeDao;


public class Tester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Company company = (Company) context.getBean("cmp");
		System.out.println(company);
	}

}
