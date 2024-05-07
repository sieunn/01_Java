package com.kh.oop.pre;

//상속, 부모클래스
public class Animal {
//필드
	private String name;
	
//메서드
	//setter
	public void setName(String name) {
		this.name = name;
	}
	//getter
	public String getName() {
		return name;
	}

	//필수생성자
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	//void
	public void makeSound() {
		System.out.println(name + " 가 소리를 냅니다.");
	}

}
