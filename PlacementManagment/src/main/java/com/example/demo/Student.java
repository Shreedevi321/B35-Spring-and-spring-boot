package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private Integer id;
	private String name;
	private Integer roll;
	private String Qualification;
	private String Course;
	private Integer year;
	private Integer hallticket;
	
	
	//default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Student(Integer id, String name, Integer roll, String qualification, String course, Integer year,
			Integer hallticket) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
		Qualification = qualification;
		Course = course;
		this.year = year;
		this.hallticket = hallticket;
	}


	//setters and getters method
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getHallticket() {
		return hallticket;
	}
	public void setHallticket(Integer hallticket) {
		this.hallticket = hallticket;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roll=" + roll + ", Qualification=" + Qualification
				+ ", Course=" + Course + ", year=" + year + ", hallticket=" + hallticket + "]";
	}
	
	
	
	
	

}
