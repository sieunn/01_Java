package com.kh.serialEx;

import java.io.Serializable;

//학생을 직렬화 하기
public class Student implements Serializable {
//필드
	private String name;
	private int age;
	
	//메서드
	//getter setter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//기본
	public Student() {

	}
	
	//필수
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//toString
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
	
	
	
	
	
	
}
