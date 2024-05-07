package pre.propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class propTest {
	public static void fileSave(Properties p) {
		//Properties에 xml 파일로 내용 저장하기
		p.setProperty("1", "페밀리맨,4,2000");
		p.setProperty("2", "엘리멘탈,5,2023");
		p.setProperty("3", "투모로우,5,2004");
		
		try {
			FileOutputStream fos = new FileOutputStream("movies.xml");
			p.storeToXML(fos, "movies is fun");
			fos.close(); //파일저장 후 종료
			
			System.out.println("설정이 movies.xml 파일에 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//fileOpen xml 파일에 있는 내용 출력
	public static void fileOpen(Properties p) {
		try {
			FileInputStream fis = new FileInputStream("movies.xml");
			p.loadFromXML(fis);
			fis.close();
			
			List<Movies> 영화들 = new ArrayList<>();
			
			for(String key : p.stringPropertyNames()) {
				String[] values = p.getProperty(key).split(",");
				
				String name = values[0];
				int 평점 = Integer.parseInt(values[1]);
				int 관람객 = Integer.parseInt(values[2]);
				
				Movies 영화 = new Movies(name,평점,관람객);
				영화들.add(영화);
			}

			Movies[] 영화정렬 = 영화들.toArray(new Movies[0]);
			
			Arrays.sort(영화정렬);
			
			System.out.println("영화 목록: ");
			for(Movies m : 영화들) {
				System.out.println(m);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Properties p = new Properties();
		fileSave(p);
		fileOpen(p);
	}
}
