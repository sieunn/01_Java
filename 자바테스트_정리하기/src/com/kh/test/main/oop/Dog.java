package com.kh.test.main.oop;

//동물 하나만 상속 implements Anilmal 이외에 여러 파일을 ,사용해서 작성할수잇음
//파일의 종류는 interface 이어야만 함
//동물에서 소리를 만드는 makeSound가 재사용되고 있지않기 때문에
//Dog에는 빨간불이 들어옴
public class Dog implements Animal,AnimalEat{
	//Animal에 있는 인터페이스 메서드 구현
	@Override //개발자간의 약속이므로 재사용은 작성해주는 것이 좋음
	public void makeSound() {
		System.out.println("멍멍");
	}
	
	@Override
	public void eat() {
		System.out.println("냠냠");
	}
}
