package com.kh.datePre;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre3 {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy / MM /dd / E");
		//System.out.println(sdf); java.text.SimpleDateFormat@8669fcf4 주소만 반환
		//sdf는 변환하고 싶은 규칙일 뿐이지 날짜를 가져올 수있는것은 아님
		String formatSdf = sdf.format(now);
		System.out.println(formatSdf);
		
		System.out.println("주민번호를 8자리 입력해주세요.");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
		
		String formatSdf2 = sdf2.format(now);
		System.out.println(formatSdf2);
		
		System.out.println("주민번호를 6자리 입력해주세요.");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyMMdd");
		
		String formatSdf3 = sdf3.format(now);
		System.out.println(formatSdf3);
		
		
		
	}
}
