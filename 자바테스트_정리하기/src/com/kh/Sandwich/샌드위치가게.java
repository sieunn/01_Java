package com.kh.Sandwich;

import java.util.*;

public class 샌드위치가게 {
	public static void main(String[] args) {
		ArrayList<샌드위치> 주문리스트 = new ArrayList<>();
		
		주문리스트.add(new 샌드위치("김하나", "BLT"));
		주문리스트.add(new 샌드위치("이둘", "터키"));
		주문리스트.add(new 샌드위치("김하나", "치킨"));
		주문리스트.add(new 샌드위치("이셋", "에그마요"));
		주문리스트.add(new 샌드위치("김하나", "베지터블"));

		System.out.println(주문리스트);
		
		//고객명 HashSet
		Set<String> 중복고객 = new HashSet<>();
		
		//중복제거리스트 ArrayList
		List<샌드위치> 중복되지않은주문 = new ArrayList<>();
		
		for(샌드위치 주문 : 주문리스트) {
			//중복여부를 확인하고 중복되지 않은 주문만 리스트에 추가
			if(!중복고객.contains(주문.get고객명())) {
				중복되지않은주문.add(주문);
				중복고객.add(주문.get고객명());
			}
		}
		//중복제거리스트 출력
		System.out.println(중복되지않은주문);
		for(샌드위치 주문 : 중복되지않은주문) {
			System.out.println(주문);
		}
	}
}
