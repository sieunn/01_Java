package com.kh.test.main;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		int 숫자 = sc.nextInt();
		
		if(숫자>=1 || 숫자<=100) {
			if(숫자%2==0) {
				System.out.println(숫자+ " 는 2의 배수입니다." );
			}else{
				System.out.println("2의 배수가 아닙니다.");
			}
		}else {
			System.out.println("1~100 사이값만 입력해주세요");
		}
		
		System.out.println("===== if else if else ====");
		
		int 숫자1 = 5;
		
		if(숫자1 >0 ) {
			System.out.println("양수입니다.");
		}else if(숫자1 < 0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("0 입니다. ");
		}
		
	}
}
