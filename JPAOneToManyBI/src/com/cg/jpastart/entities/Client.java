package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create a new department
		Department department = new Department();
		department.setId(13);
		department.setName("developer");
		
		Department department1 = new Department();
		department1.setId(14);
		department1.setName("testing");
		
		//create two instances of employees
		Employee e1 = new Employee();
		e1.setId(103);
		e1.setName("vikas");
		e1.setSalary(45000);
		
		Employee e2 = new Employee();
		e2.setId(104);
		e2.setName("Damini");
		e2.setSalary(55000);
		
		//add both employees to department
		//Association happened here emp to dept
		department.addEmployee(e1);
		department1.addEmployee(e2);
		
		//save department and its employees using entity manager
		em.persist(department);
		em.persist(department1);
		
		System.out.println("Added department along with two employees to database.");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
