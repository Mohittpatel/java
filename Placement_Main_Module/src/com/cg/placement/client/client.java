package com.cg.placement.client;

import java.time.LocalDate;



import com.cg.placement.entities.Admin;
import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;
import com.cg.placement.entities.Student;
import com.cg.placement.entities.User;
import com.cg.placement.service.CertificateServiceImpl;
import com.cg.placement.service.CollegeServiceImpl;
import com.cg.placement.service.ICertificateService;
import com.cg.placement.service.ICollegeService;
import com.cg.placement.service.IPlacementService;
import com.cg.placement.service.IStudentService;
import com.cg.placement.service.IUserService;
import com.cg.placement.service.PlacementServiceImpl;
import com.cg.placement.service.StudentServiceImpl;
import com.cg.placement.service.UserServiceImpl;

public class client {

	public static void main(String[] args) {
		
		
		Student student = new Student();
		IStudentService st = new StudentServiceImpl();
		student.setName("mohit");
		student.setRoll(21);
		student.setQualification("PostGraduation");
		student.setCourse("MCA");
		student.setYear(2022);
		student.setHallTicketNo(111);
		st.addStudent(student);
		System.out.println("Student detail added");
		/*
		College college = new College();
		ICollegeService cl = new CollegeServiceImpl();

		
		college.setCollegeName("OIST");
		college.setLocation("Bhopal");
		
		college.getStudent().add(student);
		student.setCollege(college);
		cl.addCollege(college);
		
		
		Certificate certificate = new Certificate();
		ICertificateService cr = new CertificateServiceImpl();
		
		certificate.setYear(2020);
		
		certificate.setStudent(student);
		student.setCertificate(certificate);
		certificate.setCollege(college);
		college.getCertificate().add(certificate);
		cr.addCertificate(certificate);
		
		
		Placement placement = new Placement();
		IPlacementService pl = new PlacementServiceImpl();
		
		LocalDate ld = LocalDate.now();
		placement.setName("mohit");
		placement.setDate(ld);
		placement.setQualification("Post Graduation");
		placement.setYear(2022);
		pl.addPlacement(placement);
		
		User user = new User();
		IUserService us = new UserServiceImpl();
		
		
		user.setName("mohit");
		user.setPassword("123");
		user.setType("Fresher");
		
		user.setCollege(college);
		college.setCollegAdmin("user");
		us.addNewUser(user);
		
		Admin admin = new Admin();
		
		admin.setName("mohit");
		admin.setPassword("123");
		
		admin.setUser(user);
		user.setAdmin(admin);
		
	
		
		
	
		
		
		*/
		
	}

}
