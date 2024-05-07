package 자바_예제문제실습;
/*
 빨간선 뜨는 부분 해결하기 -> 똑같은 자료형으로 두번 만들었기 때문에
 */
public class 오버로딩 {
	public void test() {}
	/*
	public void test(String str) {}
	public void test(String s) {}
	public void test(int i) {}
	private void test(int a) {}
	public void test(char a) {}
	void test(char ch) {}
	*/
	
	public void test(String str,String a) {}
	public void test(String s) {}
	public void test(int i, char b) {}
	private void test(int a) {}
	public void test(char a,boolean c) {}
	void test(char ch, int g) {}
	
	public void test(boolean a, char d) {}
	public void test(boolean b) {}
	public void test(short s, int h) {}
	public void test(short c) {}
	
	public void test(int a, boolean b) {}
	public void test(int a, String b) {}
	
	public void test(String c, char b) {}
	public void test(String c, int b) {}
	
	public void test(boolean a, boolean b) {}
	public void test(boolean a, int b) {}
}
