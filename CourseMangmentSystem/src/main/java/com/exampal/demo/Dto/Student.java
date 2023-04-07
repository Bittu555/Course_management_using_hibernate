package com.exampal.demo.Dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int student_id;
  private String studentName;
  private String studentAddress;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "capital_id", referencedColumnName = "id")
  private Project project;
  @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
  private List<Course> course;

  public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int student_id, String studentName, String studentAddress, Project project, List<Course> course) {
	super();
	this.student_id = student_id;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
	this.project = project;
	this.course = course;
}
public int getStudent_id() {
	return student_id;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
public Project getProject() {
	return project;
}
public void setProject(Project project) {
	this.project = project;
}
public List<Course> getCourse() {
	return course;
}
public void setCourse(List<Course> course) {
	this.course = course;
}

 
}
