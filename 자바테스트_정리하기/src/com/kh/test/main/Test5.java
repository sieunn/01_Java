package com.kh.test.main;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		//두 수가 모두 1~9까지 수일때만
		//두 수의 곱이 한자리 수인지 두자리 수인지를 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요");
		System.out.print("숫자1입력: ");
		int 숫자1 = sc.nextInt();
		System.out.print("숫자2입력: ");
		int 숫자2 = sc.nextInt();
		
		if(숫자1>=1 && 숫자1 <=9 && 숫자2>=1 && 숫자2 <=9) {
			int 곱 = 숫자1 * 숫자2;
			System.out.println(곱);
			if(곱 >=1 && 곱 <=9) {
				System.out.println("한자리 수 입니다.");
			}else {
				System.out.println("두자리 수 입니다.");
			}
		}else {
			System.out.println("입력한 수 중에서 1~9가 아닌 수가 있습니다.");
		}
		
	}
}
