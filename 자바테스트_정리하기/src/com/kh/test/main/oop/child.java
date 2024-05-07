package com.kh.test.main.oop;

//자식클래스로 부모클래스를 상속
//인터페이스가 아니라 클래스를 상속받을 때는 하나만 상속받을수 있음
public class child extends Parent {
//필드
	int 자식변수;

//메서드
	// 기본생성자
	public child() {

	}

	public child(int 자식변수) {
		super(); //Parent의 기본생성자라는 의미
		//super(부모변수); 하나의 자식생성자에서 super를 두번 부르는건  불가능 
		//				,자식생성자도 두개 만들어서 각각 넣어줘야함
		this.자식변수 = 자식변수;
	}

	public child(int 부모변수,int 자식변수) {
		super(부모변수); //Parent의 필수생성자를 사용하겠다는 의미
		this.자식변수 = 자식변수;
	}

	/*
	 //필수생성자 //부모변수는 Parent에서 가져올 예정 
	 public child(/int 부모변수,/ int 자식변수) {
	 	//super(); //부모변수에 어떻게 받아서 가져가겠다 라는 것이 없기 때문에 뜨는 에러 
	  				//부모 변수에도 기본 생성자를 넣어서 작성
	 	this.자식변수 = 자식변수; 
	 }
	 */
	public void 자식메서드() {
		super.부모메서드();
		System.out.println("자식도 호출되었습니다.");
	}

}
