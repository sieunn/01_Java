package com.kh.test.main;

public class Car {
//필드
	private String 차모델이름;
	private int 모델년도;
	private String 색상;
	
//메서드
	//setter
	public void set차모델이름(String 차모델이름) {
		this.차모델이름 = 차모델이름;
	}
	public void set모델년도(int 모델년도) {
		this.모델년도 = 모델년도;
	}
	public void set색상(String 색상) {
		this.색상 = 색상;
	}
	
	//getter
	public String get차모델이름() {
		return 차모델이름;
	}
	public int get모델년도() {
		return 모델년도;
	}
	public String get색상() {
		return 색상;
	}
	
	//필수생성자
	public Car(String 차모델이름, int 모델년도, String 색상) {
		this.차모델이름 = 차모델이름;
		this.모델년도 = 모델년도;
		this.색상 = 색상;
	}
	
	//기본생성자
	public Car() {
		this("k5",2013,"검정색"); //필수생성자의 내용을 가져와서 씀
	}
	
	//void 
	public String 정보() {
		return this.모델년도 + "년식" + this.차모델이름 + " " + this.색상;
	}
	//메인메서드
	public static void main(String[] args) {
		Car newCar = new Car();
		System.out.println(newCar.정보());
	}
	
}








