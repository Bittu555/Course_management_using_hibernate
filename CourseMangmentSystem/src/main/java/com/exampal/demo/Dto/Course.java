package com.exampal.demo.Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
public class Course {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int course_id;
  private String courseName;
  private String courseDuration;
  private Double courseFees;
  @ManyToOne
  @JoinColumn(name ="student_id")
  private Student student;
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(int course_id, String courseName, String courseDuration, Double courseFees, Student student) {
	super();
	this.course_id = course_id;
	this.courseName = courseName;
	this.courseDuration = courseDuration;
	this.courseFees = courseFees;
	this.student = student;
}
public int getCourse_id() {
	return course_id;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getCourseDuration() {
	return courseDuration;
}
public void setCourseDuration(String courseDuration) {
	this.courseDuration = courseDuration;
}
public Double getCourseFees() {
	return courseFees;
}
public void setCourseFees(Double courseFees) {
	this.courseFees = courseFees;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public void add(Course course) {
	// TODO Auto-generated method stub

}
}
