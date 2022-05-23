package com.cg.placement.service;

import com.cg.placement.entities.Student;

public interface IStudentService
{
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(int id);
	public Student searchStudentByHallTicket(int ticketNo);
	public boolean deleteStudent(int id);
	

}
