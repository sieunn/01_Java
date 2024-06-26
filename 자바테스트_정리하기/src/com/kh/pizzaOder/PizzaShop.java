package com.kh.pizzaOder;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaShop {
	public static void main(String[] args) {
		//고객과 피자 리스트를 한번에  묶을 ArrayList 생성
		ArrayList<PizzaOrder> 주문리스트 = new ArrayList<>();
		
		//주문목록을 저장할 ArrayList 주문리스트
		ArrayList<String> 고객리스트 = new ArrayList<>(Arrays.asList("고영희","박철진","안영식","고영희","박철진"));
		ArrayList<String> 피자리스트 = new ArrayList<>(Arrays.asList("페퍼로니","마르게리따","슈프림","파인애플","치즈피자"));
		
		//for문을 활용해서 주문 추가
		for(int i=0; i<고객리스트.size(); i++) {
			PizzaOrder 오더 = new PizzaOrder(고객리스트.get(i),피자리스트.get(i));
			주문리스트.add(오더);
		}
		
		System.out.println(고객리스트);
		System.out.println(피자리스트);
		System.out.println(주문리스트);
		
		//HashSet 사용해서 중복 주문 방지하기 위한 set 중복주문방지
		
		
		//주문 추가 PizzaOder 사용해서 주문 추가함
		
		//주문한 내용 전체보기 toString
		
		//중복된 주문 정보 제거한거 출력
	}
}

