package com.tns.placement.client;

import java.time.LocalDate;
import  com.tns.placement.entities.Certificate;
import  com.tns.placement.entities.College;
import  com.tns.placement.entities.Placement;
import  com.tns.placement.entities.Student;
import  com.tns.placement.entities.User;
import com.tns.placement.service.ICertificateService;
import com.tns.placement.service.ICertificateServiceImpl;
import com.tns.placement.service.ICollegeService;
import com.tns.placement.service.ICollegeServiceImpl;
import com.tns.placement.service.IPlacementService;
import com.tns.placement.service.IPlacementServiceImpl;
import com.tns.placement.service.IStudentService;
import com.tns.placement.service.IStudentServiceImpl;
import com.tns.placement.service.IUserService;
import com.tns.placement.service.IUserServiceImpl;

public class Client {

	public static void main(String[] args) {
		
	   User user = new User();
		College college = new College();
		Student student = new Student();
		Placement placement = new Placement();
		Certificate certificate = new Certificate();
		
		IUserService service = new IUserServiceImpl();
		ICollegeService service1 = new ICollegeServiceImpl();
		IStudentService service2 = new IStudentServiceImpl();
		IPlacementService service3 = new IPlacementServiceImpl();
		ICertificateService service4 = new ICertificateServiceImpl();
			
	//Create
   	    user.setId(4);
	    user.setName("Mohit");
		user.setPassword("@mohit123");
      	user.setType("College Admin");
		
		college.setId(2); 
		college.setCollegeName("MIT");
		college.setLocation("Cambridge");
		
		student.setId(1);
		student.setName("Rahul");
		student.setRoll(50);
		student.setQualification("MCA");
		student.setCourse("CS");
		student.setYear(2021);
		student.setHallTicketNo(123437);

		placement.setId(1); 
		placement.setName("Rahul");
		LocalDate d1 = LocalDate.of(2021, 12, 1);
		placement.setDate(d1);
		placement.setQualification("BSc"); 
		placement.setYear(2021);
		certificate.setId(1);
		certificate.setYear(2021);
		
		college.setUser(user);
		college.addStudent1(student);
		college.addPlacement1(placement);
		college.addCertificate1(certificate);
		student.setCertificate(certificate);
		certificate.setStudent(student);
		
	    service.addUser(user);
		service1.addCollege(college);
		service2.addStudent(student);
		service3.addPlacement(placement);
		service4.addCertificate(certificate);
		System.out.println("Data is created successfully");
		
	
//		//Retrieval
//		user = service.searchUserById(1);
//		System.out.println(user.getName());
//		System.out.println(user.getType());
//		System.out.println(user.getPassword());
//		
//		college = service1.searchCollege(1);
//		System.out.println(college.getUser());
//		System.out.println(college.getCollegeName());
//		System.out.println(college.getLocation());
//		
//		student = service2.searchStudentById(1);
//		System.out.println(student.getName());
//		System.out.println(student.getCollege());
//		System.out.println(student.getRoll());
//		System.out.println(student.getQualification());
//		System.out.println(student.getCourse());
//		System.out.println(student.getYear());
//		System.out.println(student.getCertificate());
//		System.out.println(student.getHallTicketNo());
//		
//		placement = service3.searchPlacement(1);
//		System.out.println(placement.getName());
//		System.out.println(placement.getCollege());
//		System.out.println(placement.getDate());
//		System.out.println(placement.getQualification());
//		System.out.println(placement.getYear());
//		
//		certificate = service4.searchCertificate(1);
//		System.out.println(certificate.getYear());
//		System.out.println(certificate.getCollege());
//		System.out.println("Data is retrieved successfully");
	
	
		
		

//        //Update
//		user = service.searchUserById(1);
//		user.setName("Elizabeth");
//		user.setPassword("@Elizabeth");
//		service.updateUser(user);
//		
//		college = service1.searchCollege(1);
//		college.setCollegeName("Harvard");
//		service1.updateCollege(college);
//		
//		student = service2.searchStudentById(1);
//		student.setName("Selena");
//		student.setQualification("BA");
//		student.setYear(2019);
//		service2.updateStudent(student);
//		
//		placement = service3.searchPlacement(1);
//		placement.setName("Selena");
//		placement.setQualification("BA");
//		LocalDate d4 = LocalDate.of(2019, 8, 6);
//		placement.setDate(d4);
//		placement.setYear(2019);
//		service3.updatePlacement(placement);
//		
//		certificate = service4.searchCertificate(1);
//		certificate.setYear(2019);
//		service4.updateCertificate(certificate);
//		
//		student.setCertificate(certificate);
//		certificate.setStudent(student);
//		System.out.println("Data is updated successfully");
	
	
	
		//Delete
//		user = service.searchUserById(1);
//		college = service1.searchCollege(1);
//		student = service2.searchStudentById(1);
//		student = service2.searchStudentById(2);
//		student = service2.searchStudentById(3);
//		placement = service3.searchPlacement(3);
//		certificate = service4.searchCertificate(3);
//		
//        service.deleteUser(user);
//        service1.deleteCollege(college);
//		service2.deleteStudent(student);
//		
//		service3.deletePlacement(placement);
//		service4.deleteCertificate(certificate);
//		System.out.println("Delete is performed successfully");
	}		
}




