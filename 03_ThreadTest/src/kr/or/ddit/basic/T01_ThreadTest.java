package kr.or.ddit.basic;

/*
 * 싱글쓰레드 프로그램
 * @author sem
 */
public class T01_ThreadTest {
	public static void main(String[] args) {
		for(int i = 0; i <= 200; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i = 1; i <= 200; i++) {
			System.out.print("$");
		}
	}
}
