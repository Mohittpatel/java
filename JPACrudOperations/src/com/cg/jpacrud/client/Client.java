package com.cg.jpacrud.client;

import com.cg.jpacrud.entities.Student;
import com.cg.jpacrud.service.StudentService;
import com.cg.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {

		//Debug this program as Debug -> Debug as Java Application
		
		StudentService service = new StudentServiceImpl();
		
	
		Student student = new Student();
		
		 // Create Operation
		student.setSid(106);
		student.setSname("joyce");
		
		service.addStudent(student);
		/*
		
		//at this breakpoint, we have added one record to table
		// Retrieve Operation
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getSid());
		System.out.println(" Name:"+student.getSname()); // Sachin
	
		 
		// Update Operation
		student = service.findStudentById(101);
		student.setSname("timothy");
		service.updateStudent(student);
		
		//at this breakpoint, we have updated record added in first section
		
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getSid());
		System.out.println(" Name:"+student.getSname());  // Sachin Tendulkar
		
	
		//at this breakpoint, record is removed from table
		// Delete Operation
		student = service.findStudentById(102);
		service.removeStudent(student);
		System.out.println("End of program/Life cycle completed...");  
	
	
		*/

	}
}
