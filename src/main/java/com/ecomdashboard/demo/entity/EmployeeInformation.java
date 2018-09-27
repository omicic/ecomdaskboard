package com.ecomdashboard.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeInformation", schema="ecomdashapp")
public class EmployeeInformation extends KeyEntity {
	
	@Column(name="name")
	private String _name;
	@Column(name="position")
	private String position;
	@Column(name="officeLocation")
	private String officeLocation;
	@Column(name="age")
	private int age;
	@Column(name="startDate")
	private Date startDate;
	@Column(name="salary")
	private double salary;
	
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getOfficeLocation() {
		return officeLocation;
	}
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
