package sub2.controller;

import java.util.Scanner;

import sub2.model.Student;

public class TestSup2 {
	public static void main(String[] args) {
		//스캐너로 이름 학년 반 번호 성별 성적
		Scanner sc = new Scanner(System.in);
		System.out.println("이름입력: ");
		String 이름 = sc.nextLine();
		System.out.println("학년입력: ");
		int 학년 = sc.nextInt();
		System.out.println("반 입력: ");
		int 반 = sc.nextInt();
		System.out.println("번호 입력: ");
		int 번호 = sc.nextInt();
		System.out.println("성별 입력(M/F): ");
		char 성별 = sc.next().charAt(0);
		System.out.println("성적 입력: ");
		double 성적 = sc.nextDouble();
		
	
		Student 학생 = new Student(이름,학년,반,번호,성별,성적);
		
		학생.정보();
		sc.close();
	}

}
