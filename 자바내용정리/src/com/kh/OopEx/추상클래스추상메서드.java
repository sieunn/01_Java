package com.kh.OopEx;
/*
 추상클래스 : 하나 이상의 추상 메서드를 포함할 수 있는 클래스
 		   default 까지는 가능하지만 private 사용하면 에러발생
 		   
 		   추상 메서드는 인터페이스와 마찬가지로 메서드 이름까지만 존재하고
 		   본문은 존재하지 않는 메서드
 		   추상 클래스에서는 추상메서드를 만들어줘야함
 		   객체를 직접 생성할 수 없기 때문에 추상클래스를 상속받는 하위 클래스에서
 		   추상 메서드를 작성해야만 사용할 수 있음
 		   
 		   public abstract class 클래스이름{ }
 		   
 		   추후 추상클래스를 자식클래스에서 사용하길 원한다면 extends를 사용해서 작성
 		   
 추상메서드 : 하나 이상의 추상 메서드를 추상클래스는 포함할 수 있음
 		   생성자 메서드도 만들 수 있긴 하지만
 		   만들면 반드시 자식클래스에서 생성자 또한 사용을 해줘야함
 		   
 		   
 * */
public abstract class 추상클래스추상메서드 {
	abstract void 추상메서드();
}
