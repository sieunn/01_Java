package ncs.test4;

public class Product {
//필드
	private String name;
	private int price;
	private int quantity;
	
//메서드
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	//getter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	//기본생성자
	public Product() {

	}
	
	//필수생성자
	public Product(String name, int price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
	}
	
	public String 정보() {
		return "상품명: " + name 
				+ " 가격: " + price 
				+ "원, 수량: "+ quantity 
				+ "개, 총 구매가격: "+ getPrice() + "원";
	}
}
