package 자바_예제문제실습;
/*
 캡슐화 원칙에 맞게 구현하기

 */

public class Animal {
//필드
	private String 둥물이름;
	private int 나이;

//메서드
	// getter setter
	public void set둥물이름(String 둥물이름) {
		this.둥물이름 = 둥물이름;
	}

	public void set나이(int 나이) {
		this.나이 = 나이;
	}

	public String get둥물이름() {
		return 둥물이름;
	}

	public int get나이() {
		return 나이;
	}

	// 기본
	public Animal() {

	}

	// 필수
	public Animal(String 둥물이름, int 나이) {
		super();
		this.둥물이름 = 둥물이름;
		this.나이 = 나이;
	}

	//toString alt shift s
	@Override
	public String toString() {
		return "둥물이름=" + 둥물이름 + ", 나이=" + 나이;
	}

}
