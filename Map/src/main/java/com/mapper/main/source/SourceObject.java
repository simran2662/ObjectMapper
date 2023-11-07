package com.mapper.main.source;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapping;

public class SourceObject {
	
	@Mapping("name")
	private String name;
	
	@Mapping("address")
	private String address;
	@Mapping("pupils")
	private List<Student> student;
	
	public SourceObject() {
        student = new ArrayList<>();  // Initialize the list
    }
	
	public void addStudent(Student student) {
        this.student.add(student);  // Add a Student object to the list
    }
    
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public SourceObject(String name, String address, List<Student> student) {
		super();
		this.name = name;
		this.address = address;
		this.student = student;
	}
	
	@Override
	public String toString() {
		return "SourceObject [name=" + name + ", address=" + address + ", student=" + student + "]";
	}
	
		
	
	
	

}
