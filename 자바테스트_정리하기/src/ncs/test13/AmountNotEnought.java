package ncs.test13;
//extends exception
public class AmountNotEnought extends Exception {
	//양이 충분하지 않을 때 표시하는 에러를 개발자가 만들어준것
	public AmountNotEnought (String msg) {
		super(msg);
		
		/*
		 //만약에 제품이 존재하지 않을경우 AmountNotEnough 넣고 사용을 할것
		for(Inventory 인벤토리 : inventoryMap.values()) {
			if(인벤토리.getGetAmount() > 인벤토리.getPutAmount()) {
				throw new AmountNotEnought("출고 수량이 재고 수량을 초과했습니다.");
			}
		}
		 */
	}
}
