package com.kh.test.main;

import java.util.ArrayList;
import java.util.Arrays;

public class 리스트예제 {
	public static void main(String[] args) {
		//ArrayList 생성
		ArrayList<String> 리스트 = new ArrayList<>(Arrays.asList("바나나","오렌지"));
		//값추가 방법2
		리스트.add("사과");
		System.out.println(리스트);
		
		//값제거
		리스트.remove("바나나"); //값을 직접 작성후 삭제
		리스트.remove(0); //인덱스 위치 지정후 삭제
		System.out.println(리스트); //사과만 출력 2번인덱스->0번인덱스
		
		//값변경
		리스트.set(0, "체리"); 
		System.out.println(리스트); //사과->체리 
		
		
		/*
		 리스트.add(2,"파파야");
		 리스트는 순서대로 0부터 +1해서 자리가 생기는 것이기 때문에
		 0=체리
		 1=비어있음
		 2=파파야
		 이런식으로 파파야를 추가하는 것은 자리값이 맞지 않는다는 에러가 발생하기 때문에
		 번호 순서대로 값을 추가해줘야함
		 */
		리스트.add(1,"파파야");
		System.out.println(리스트);
		
		//크기확인
		System.out.println(리스트.size());
		
		//포함여부 확인
		System.out.println(리스트.contains("파파야"));

		//인덱스확인
		System.out.println(리스트.indexOf("체리")); //체리는 0번째이기 때문에 0이 나옴, 체리가 없어서 0이 나오는것이 아님
	}
	
	
	
}
