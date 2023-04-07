package com.exampal.demo.Dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Project {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int project_id;
  private String projectName;
  private String domain;
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name ="student_id")
  private Student student;
public Project() {
	super();
}
public Project(int project_id, String projectName, String domain, Student student) {
	super();
	this.project_id = project_id;
	this.projectName = projectName;
	this.domain = domain;
	this.student = student;
}
public int getProject_id() {
	return project_id;
}
public void setProject_id(int project_id) {
	this.project_id = project_id;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
}
