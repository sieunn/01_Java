package com.kh.test.main;

public class Test7 {
	public static void main(String[] args) {
		//배열이 들어있는 데이터 중 홀수의 값들을 출력하고 합들을 구한다
		//continue 를 이용하여 작성
		
		int[] 배열 = {1,2,3,4,5,6,7,8,9,10};
		double 합 = 0;
		
		for(int num : 배열) {
			if(num %2 != 0) {
				System.out.println(num);
				합 += num;
			}
		}
		System.out.println("합계: " + 합);
	}
}
