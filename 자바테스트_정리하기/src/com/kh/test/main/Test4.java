package com.kh.test.main;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		/*
		 1부터 9까지 값을 스케너로 각각 입력받아
		 더하기 빼기 곱하기 목 출력
		 
		 int 숫자1
		 int 숫자2
		  */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자1 입력: ");
			int 숫자1 = sc.nextInt();
			
			if(숫자1 <=1 || 숫자1<=9 ) {
				System.out.println("숫자2 입력: ");
				int 숫자2 = sc.nextInt();
				if(숫자2 <= 1 || 숫자2 <=9) {
					System.out.println(숫자1 + "+" + 숫자2 + "=" +(숫자1+숫자2));
					System.out.println(숫자1 + "-" + 숫자2 + "=" +(숫자1-숫자2));
					System.out.println(숫자1 + "*" + 숫자2 + "=" +(숫자1*숫자2));
					System.out.println(숫자1 + "/" + 숫자2 + "=" +(숫자1/숫자2));
				}else {
					System.out.println("1~9 사이의 숫자를 입력하세요");
				}
			}else {
				System.out.println("1~9 사이의 숫자를 입력하세요");
			}
		}
	}
}
