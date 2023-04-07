package com.exampal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exampal.demo.Dto.Course;
import com.exampal.demo.Dto.Project;
import com.exampal.demo.Dto.Student;

import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

	public class  CourseMangmentSystemApplication{

	    public static void main(String[] args) {

	        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//  "/home/kumar/Downloads/CourseMangmentSystem/src/main/resources/hibernate.cfg.xml"
	        Session session = sessionFactory.openSession();

	        session.beginTransaction();

	        Student student = new Student();
	        student.setStudentName("John Doe");
	        student.setStudentAddress("123 Main St, Anytown USA");

	        Course course = new Course();
	        course.setCourseName("Java Development");
	        course.setCourseDuration("6 months");
	        course.setCourseFees(3000.00);
	        course.setStudent(student);
	        student.getCourse().add(course);

	        Project finalProject = new Project();
	        finalProject.setProjectName("Student Management System");
	        finalProject.setDomain("Java");
	        finalProject.setStudent(student);
	        student.setProject(finalProject);

	        session.save(student);

	        session.getTransaction().commit();

	        Student retrievedStudent = session.get(Student.class, student.getStudent_id());
	        System.out.println("Retrieved Student: " + retrievedStudent);

	        session.beginTransaction();
	        retrievedStudent.setStudentAddress("456 Elm St, Anytown USA");
	        session.update(retrievedStudent);
	        session.getTransaction().commit();

	        session.beginTransaction();
	        session.delete(retrievedStudent);
	        session.getTransaction().commit();

	        sessionFactory.close();
	    }
	}


