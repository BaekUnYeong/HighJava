package Homework;

import java.util.HashSet;
import java.util.Scanner;

public class Practice_Lotto {

	public static void main(String[] args) {
		start();
	}
	private static void start() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------- Lotto ---------------------\r"
				+ "\t\t 1. Lotto 구입 \r\t\t 2. 프로그램 종료\r"
				+ "-------------------------------------------------");
		System.out.println("번호를 선택해주세요 > ");


		String menu = sc.nextLine();
		
		switch (menu) {
		case "1":
			lotto();
			break;
		case "2":
			System.out.println("프로그램을 종료합니다.");
			return;

		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			start();
		}
	}
	private static void lotto() {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		System.out.println("-------------------------------------------------\r"
				+ "\t\t로또 한장당 1000원입니다.");
		System.out.println("금액을 입력해주세요.");
		Integer money = Integer.parseInt(sc.nextLine());
		
		if(money < 1000) {
			System.out.println("금액이 모자랍니다. 다시 입력해주세요.");
			lotto();
		}
		System.out.println("행운의 로또 번호는 다음과 같습니다.");
		
		for(int i = 1; i <= money/1000; i++) {
			while(lotto.size() < 6) {
				int number = (int)(Math.random() * 45 + 1);
				lotto.add(number);
			}
			System.out.println("로또 번호 " + i + " : " + lotto);
			lotto.clear();
		}
		System.out.println("거스름돈은 " + money%1000 + " 입니다.");
		start();
	}
	
}
