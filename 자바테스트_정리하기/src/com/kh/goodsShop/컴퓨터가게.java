package com.kh.goodsShop;

import java.util.*;

public class 컴퓨터가게 {
	public static void main(String[] args) {
		//모든 제품 HashMap
		Map<String,Integer> 제품 = new HashMap<>();
		
		//상품 추가
		 제품.put("노트북", 700000);
		 제품.put("데스크탑", 20000);
		 제품.put("모니터", 5000);
		 제품.put("마우스", 3000);
		 제품.put("키보드", 2000);
		
		System.out.println("컴퓨터 상품 목록");
		
		//Entry 사용해서 출력
		for(Map.Entry<String, Integer> e : 제품.entrySet()) {
			String 제품명 = e.getKey();
			Integer 제품가격 = e.getValue();
			System.out.println(제품명 + "은(는) " + 제품가격 + "원 입니다.");
		}
		
		//특정 물품의 가격 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("찾는물건 입력: ");
		String 찾는물건 = sc.nextLine(); //USb
		
		System.out.println(찾는물건+ " 가게에 있습니까?");
		
		//찾는 물건이 존재하는지 않하는지 if문으로 확인후 
		//존재한다면 네 존재합니다.
		//존재하지 않는다면 품절입니다. 
		if(제품.containsKey(찾는물건)) {
			int 제품가격 = 제품.get(찾는물건);
			System.out.println("네 있습니다. 가격은 " + 제품가격 + "원 입니다." );
		}else {
			System.out.println("품절입니다.");
		}
		
	}
}
