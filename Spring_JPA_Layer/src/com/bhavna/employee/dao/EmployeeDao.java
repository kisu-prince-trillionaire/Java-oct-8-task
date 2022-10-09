package com.bhavna.employee.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bhavna.employee.entity.EmployeeEntity;

public class EmployeeDao {
	public static void addEmployee() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		System.out.println("Database Connected");
		EntityManager em = entityManagerFactory.createEntityManager();
		EmployeeEntity emp = new EmployeeEntity(104, "Kam", 50000);
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		System.out.println("Record Inserted");
		em.close();
	}
	
	public static void updateEmployee() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager em = entityManagerFactory.createEntityManager();
		EmployeeEntity emp = new EmployeeEntity(101, "Tam", 40000);
		em.getTransaction().begin();
		em.merge(emp);
		em.getTransaction().commit();
		System.out.println("Record Updated");
		em.close();
	}
	
	public static void deleteEmployee() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager em = entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		EmployeeEntity emp = em.find(EmployeeEntity.class, 102);
		if(emp != null) {
			em.remove(emp);
			System.out.println("Record Removed");
		} else {
			System.out.println("No record Found");
		}
		em.getTransaction().commit();
		System.out.println("Record Updated");
		em.close();
	}
	
	public static void getEmployee() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		EntityManager em = entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		EmployeeEntity emp = em.find(EmployeeEntity.class, 103);
		if(emp != null) {
			System.out.println(emp);
		} else {
			System.out.println("No record Found");
		}
		em.getTransaction().commit();
		System.out.println("Record Updated");
		em.close();
	}
}
