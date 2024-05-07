package com.kh.test.main;

public class ParseStringPre2 {
	public static void main(String[] args) {
		//1. String 으로 받은 핸드폰 번호를 정수로 변경
		String phoneNumber = "01012345678";
		int num1 = Integer.parseInt(phoneNumber);
		System.out.println(num1);
		
		//2. String 으로 받은 점수를 실수로 변경
		String score = "88.9";
		double num2 = Double.parseDouble(score);
		System.out.println(num2);
		
		//3. 정수로 받은 핸드폰번호를 String으로 변환
		int phoneNumber2 = 102345678;
		String str1 = Integer.toString(phoneNumber2);
		System.out.println(str1);
		
		//4. 실수로 받은 점수를 String으로 변경
		double score2 = 72.5;
		String str2 = Double.toString(score2);
		System.out.println(str2);
		
		//문자열에서 - 하이픈 제거
		String phoneNumber3 = "010-1234-5678";
		//replace 어떤 값을 모두 변경
		//""안에 아무것도 작성해주지 않으면 삭제라는 의미로 사용
		String 하이픈제거 = phoneNumber3.replace("-", "");
		System.out.println("하이픈이 제거된 핸드폰번호: " + 하이픈제거);
		
		
		//주민번호에서 하이픈 제거
		String id = "230825-1234567";
		String 주민번호 = id.replace("-", "");
		System.out.println("하이픈이 제거된 주민번호: " + 주민번호);
		
		
		//charAt(7)
		//주민번호에서 하이픈을 제거하고 성별을 추출하기
		String id2 = "240501-3456789";
		String 주민번호2 = id2.replace("-", "");
		char 성별번호 = 주민번호2.charAt(6);
		System.out.println("성별번호는: " + 성별번호); //3출력
		
		//3항연산자를 사용해서 성별번호가 1또는 3이면 ? 남성 : 여성
		String 성별 = (성별번호 =='1' || 성별번호=='3') ? "남성" : "여성";
		System.out.println(성별);
		
		//주민번호에서 - 제거하고 삼항연산자를 사용해서 성별추출
		String id3 = "200101-457891";
		String 주민번호3 = id3.replace("-", "");
		char 성별번호3 = 주민번호3.charAt(6);
		String 성별3 = (성별번호3=='1' || 성별번호3=='3') ? "남성" : "여성";
		System.out.println("하이픈이 제거된 주민번호: " +주민번호3);
		System.out.println("성별: " +성별3);
		
		
		String 주민번호4 = "123456-1234567"; //인덱스:0~13, 길이:14
		//주민번호가 앞에는 6자리가 맞는지확인하고 뒤에는 7자리가 맞는지 확인
		boolean is주민 = (주민번호4.length() == 14) &&  //1.주민번호가 - 포함해서 14자리가 맞는지 확인
						(주민번호4.charAt(6)=='-') && //2. 주민번호 생년월일작성후 - 들어가있는지
						(주민번호4.substring(0,6).matches("[0-9]+")) && //3. 앞에 6자리가 숫자로만 이루어져있는지
						(주민번호4.substring(7).matches("[0-9]+")); //4. 뒤에서 7번부터 모두 숫자로 이루어져있는지
		System.out.println("주민번호가 제대로 작성이 이루어졌나요?: " + is주민);
		
	}
}















