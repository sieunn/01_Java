package com.kh.variableEx;
/*
 type(자료형) name(변수명) = literal(변수값);
 
 변수
	자료형(기본) = primitive type
	 숫자 : byte short int long //int가 기본값
	 문자 : char 			 // '' 사용, 한글자만 들어갈수 있음
	 실수 : float double 	 // double이 기본값
	 참거짓 : boolean		 //false가 기본값
	 
	자료형(참조) = reference type
	 문자열 : String		// " "사용, 문자를 모두 나열하는 문자열, 특수문자 등 모든것 사용가능
	
	상수형
	 final 자료형 상수명 = 값;
	 final int MAX_NUM = 100; //상시적으로 변하지 않는 수 , 값변화X , 이름을 대문자로 표기
	
	열거형
	 상수를 하나씩 작성하기 번거로우니 관련있는 상수들을 한번에 {} 안에 작성해서 
	 final 과 자료형을 생략해서 작성하는 상수 표기방법
	 열거형 예시를 들면서 요일,계절과 같이 변함없는 예제를 사용해서 상수를 나열하는 방법을 확인함
	 enum 대표이름 {
	 	상수를 모두 작성
	 }
	 
 */
//변수명은 어떤 특정 행위나 행동을 하기 위한 것이 아니기 때문에 메서드 안에 작성하지 않아도 괜찮음
//System.out.print와 같은 행동은 무언가를 실행하기 위한 표기이기 때문에 메서드 안에 작성해줘야함
//클래스에서 바로 작성 가능

public class 기본변수 {
//필드
	//자료형 기본
		//1. 숫자
		int 숫자 = 10;
		byte b = 2;
		short sh = 3;
		long lng = 4;
		float ft = 3.14f; //기본 실수값은 double이고 double은 float보다 큰값이기 때문에 
						  //뒤에 f나F를 붙여서 작성해줘야함
		double db = 3.14;
		char ch = 'A'; //한글자만 넣어야함
		boolean bln; // 과 boolean bln = false; 는 서로 같은 뜻 boolean의 초기값은 false기 때문
	
	//자료형 참조
		String name = "가나다"; //추가로 만들어진 자료형으로 대문자 S로 시작함
		//누구나 참조 자료형을 만들 수 있음

	//상수형 - 모두 사용할 경우 static 작성
		final int MAX_NUM = 100;
		final double PI =3.14;
		final String 규칙 = "변경되면 안되는 규칙";
		
	//열거형 enum
		//관련있는 상수형 모음집
		enum Day{
			MONDAY,THESDAY,WEDENSDAY,THURSDAY,FIRDAY,SATURDAY,SUNDAY
		}

}




















