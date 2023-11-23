package com.kgisl.springjdbcjavaconfig.model;

public class Teacher {
	public int id;
	public String name;
	public String expertise;
	public Teacher() {
	}
	public Teacher(int id, String name, String expertise) {
		this.id = id;
		this.name = name;
		this.expertise = expertise;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", expertise=" + expertise + "]";
	}
}
