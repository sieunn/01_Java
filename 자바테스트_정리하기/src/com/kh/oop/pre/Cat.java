package com.kh.oop.pre;
//extends Animal 가져오기
public class Cat extends Animal{

	//super 이용해서 Cat에서 부모클래스에 잇는 필수생성자 호출
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("고양이가 "+ getName() + "야옹");
	}
	
}
