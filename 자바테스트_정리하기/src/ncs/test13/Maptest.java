package ncs.test13;

import java.util.*;

public class Maptest {
	public static void main(String[] args) {
		Map<String,Inventory> inventoryMap = new HashMap<>();
		
		//상품정보 String 으로 어떤 핸드폰인지 작성  Inventory에 핸드폰 정보 넣기
		//상품정보 틍록
		Calendar 캘린더 = Calendar.getInstance();
		
		캘린더.set(2016, 캘린더.MARCH, 15); //제품별 날짜를 다르게 설정해서 넣어줌
		inventoryMap.put("삼성 갤럭시s7", new Inventory("삼성 갤럭시 s7",캘린더.getTime(),30));

		캘린더.set(2016, 캘린더.FEBRUARY, 25);
		inventoryMap.put("LG g5", new Inventory("LG g5",캘린더.getTime(),20));
		
		캘린더.set(2016, 캘린더.JANUARY, 23);
		inventoryMap.put("애플 아이패드pro", new Inventory("애플 아이패드pro",캘린더.getTime(),15));
	
		
		
		try {
		
		캘린더.set(2016, 캘린더.APRIL, 28);//출고날짜
		inventoryMap.get("삼성 갤럭시s7").setGetDate(캘린더.getTime()); //출고날짜
		inventoryMap.get("삼성 갤럭시s7").setGetAmount(10);//출고갯수
		
		inventoryMap.get("LG g5").setGetDate(캘린더.getTime());
		inventoryMap.get("LG g5").setGetAmount(10);

		inventoryMap.get("애플 아이패드pro").setGetDate(캘린더.getTime());
		inventoryMap.get("애플 아이패드pro").setGetAmount(10);
		
		//만약에 제품이 존재하지 않을경우 AmountNotEnough 넣고 사용을 할것
		for(Inventory 인벤토리 : inventoryMap.values()) {
			//내가 가지고 있는 양보다 		<    출고 양이 더 많을 경우
			//    판매하고자하는 양 		 >    현재 가지고 있는 양
			if(인벤토리.getGetAmount() > 인벤토리.getPutAmount()) {
				throw new AmountNotEnought("출고 수량이 재고 수량을 초과했습니다.");
			}
		}
		}catch(AmountNotEnought e) {
			e.printStackTrace(); //에러를 출력해서 보여주기
		}
		
		
		
		//for each문을 활용해서 상품 정보 출력하기
		for(Inventory e : inventoryMap.values()) {
			System.out.println(e.toString());//상품 정보 출력
		}
		//현재는 팔린 제품이 없기 때문에 출고일, 출고 수량, 남은 수량은 없음
		
	}
}
