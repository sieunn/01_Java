package 자바_예제문제실습;

public class Person {
//필드
	private String 사람이름;
	private int 나이;

//메서드
	//getter setter
	public String get사람이름() {
		return 사람이름;
	}
	public int get나이() {
		return 나이;
	}
	public void set사람이름(String 사람이름) {
		this.사람이름 = 사람이름;
	}
	
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	
	//기본
	public Person() {

	}
	
	//필수
	public Person(String 사람이름, int 나이) {
		super();
		this.사람이름 = 사람이름;
		this.나이 = 나이;
	}
	
	//toString
	@Override
	public String toString() {
		return "사람이름=" + 사람이름 + ", 나이=" + 나이;
	}

}
