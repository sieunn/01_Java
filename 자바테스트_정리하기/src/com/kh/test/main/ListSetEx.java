package com.kh.test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//ArrayLsit와 HashSet 함께 사용하기
public class ListSetEx {
	public static void main(String[] args) {
		ArrayList<String> 리스트 = new ArrayList<>();
		//값추가
		리스트.add("피자");
		리스트.add("햄버거");
		리스트.add("서브웨이");
		리스트.add("피자"); //중복가능
		
		//HashSet 선언 초기화
		//객체를 통해 인스턴스 만듬
		HashSet<String> 헤시셋 = new HashSet<>();
		헤시셋.add("피자");
		헤시셋.add("햄버거");
		헤시셋.add("서브웨이");
		헤시셋.add("피자");//중복불가능
		
		System.out.println(리스트);
		System.out.println(헤시셋);
	
		//키에 숫자도 가능, 중복x
		HashMap<Integer,String> 해시맵 = new HashMap<>();
		System.out.println("안녕하세요. 과일가게에 오신것을 환영합니다.");
		해시맵.put(1, "망고");
		해시맵.put(2, "패션후르츠");
		해시맵.put(3, "망고스틴");
		System.out.println(해시맵);
		
		해시맵.put(1, "샤인머스켓");
		System.out.println(해시맵);
	}
}
