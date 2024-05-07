package 자바_예제문제실습;

public class 배열 {
	public static void main(String[] args) {
		Circle[] 원들 = new Circle[2];
		//for문 범위확인
		//i 값이 비어있지는 않은지 확인
		//원[0] 원[1] 각 자리에 값이 비어있지 않은지 확인
		System.out.println("원[0] : " + 원들[0]);
		//null이 되지 않도록 값을 넣어주거나 null설정해야함
		원들[0] = new Circle(2.5);
		원들[1] = new Circle(3.5);
		
		for(int i=0; i<원들.length; i++) {
			System.out.println(원들[i].getRadius());
		}
	}
}
