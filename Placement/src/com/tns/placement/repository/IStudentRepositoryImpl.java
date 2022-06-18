package com.tns.placement.repository;

import javax.persistence.EntityManager;
import com.tns.placement.entities.Student;

public class IStudentRepositoryImpl implements IStudentRepository 
{
	//Step 1: Start JPA LifeCycle
	private EntityManager entityManager;
	
	public IStudentRepositoryImpl()   
    {
		entityManager=JPAUtil. getEntityManager();
	}

	//Create operation- Repo
	@Override
	public Student addStudent(Student student) {
		entityManager.persist(student);
		return student;
	}
	
	//update operation-Repo
	@Override
	public Student updateStudent(Student student) {
		entityManager.merge(student);
		return student;
	}
	
	//search operation-Repo
	@Override
	public Student searchStudentById(int id) {
		Student student=entityManager.find(Student.class,id);
		return student;
	}

	//delete operation-Repo
	@Override
	public Student deleteStudent(Student student) {
		entityManager.remove(student);
		return student;
	}


	@Override
	public void commitTranscation() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
}
