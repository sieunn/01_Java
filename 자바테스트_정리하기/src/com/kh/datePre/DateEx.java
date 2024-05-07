package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		//Date는 최초 1회만 호출
		Date now = new Date();
		//Date로 현재 날짜를 받아서 년-월-일 출력하기
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String format1 = sdf1.format(now);
		System.out.println(format1);
		
		//문자열(SimpleDateFormat - String) -> 날짜(Date)로 변경
		String 날짜문자열 = "2024-05-03";
		try {
			Date parseDate1 = sdf1.parse(날짜문자열);
			System.out.println(parseDate1);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
	
		
		//시:분:초 출력
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		String format2 = sdf2.format(now);
		System.out.println(format2);
		
		//문자열(SimpleDateFormat - String) -> 날짜(Date)로 변경
		try {
			Date parseDate2 = sdf2.parse(format2);
			System.out.println(parseDate2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		//년-월-일 시:분:초 출력
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format3 = sdf3.format(now);
		System.out.println(format3);
		
		//문자열(SimpleDateFormat - String) -> 날짜(Date)로 변경
		try {
			Date parseDate3 = sdf3.parse(format3);
			System.out.println(parseDate3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
}
