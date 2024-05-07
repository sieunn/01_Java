package com.kh.test.main.oop;

public class Parent {
//필드
	int 부모변수;
	
//메서드
	//기본생성자
	public Parent() {

	}
	
	//필수생성자
	public Parent(int 부모변수) {
		this.부모변수 = 부모변수;
	}
	
	public void 부모메서드() {
		System.out.println("부모님이 등장했습니다.");
	}

	
}
