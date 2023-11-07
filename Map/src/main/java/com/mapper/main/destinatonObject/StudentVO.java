package com.mapper.main.destinatonObject;

public class StudentVO {
	
	private String name;
	private String batchName;
	private String homeAddress;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public StudentVO(String name, String batchName, String homeAddress) {
		super();
		this.name = name;
		this.batchName = batchName;
		this.homeAddress = homeAddress;
	}
	public StudentVO() {
		super();
	}
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", batchName=" + batchName + ", homeAddress=" + homeAddress + "]";
	}
	
	
	

}
