package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class T11_BaseBallTest {

	public static void main(String[] args) {
		
		/*
		  문제) Set을 이용하여 숫자 야구 게임 프로그램을 작성하시오.
		  컴퓨터의 숫자는 난수를 이용하여 구한다.
		  (스트라이크는 'S', 볼은 'B'로 출력한다.)
		  
		  컴퓨터의 난수가 9 5 7 일때 실행 예시
		  숫자 입력 => 3 5 6
		  3 5 6 => 1S 0B
		  숫자 입력 => 7 8 9
		  7 8 9 => 0S 2B
		  
		  ...
		  
		  숫자 입력 = 9 5 7
		  9 5 7 = > 3S 0B
		  
		  5번째 만에 맞췄군요.
		  
		 */
		
		HashSet<Integer> random = new HashSet<>();
		
		int count = 0, strike = 0, ball = 0;
		
		Scanner sc = new Scanner(System.in);
		
			while(random.size() < 3) {
				int number = (int)(Math.random() * 9 + 1);
				random.add(number);
			}
			
			List<Integer> num = new ArrayList<>(random);
			List<Integer> input = new ArrayList<>();
			
			Collections.shuffle(num);
				
			while(strike < 3) {
				strike = 0;
				ball = 0;
				
				System.out.println("숫자를 입력해주세요 > ");
					input.add(sc.nextInt());
					
					for(int i = 0; i < num.size(); i++) {
						for(int j = 0; j < input.size(); j++) {
							if(num.get(i) == input.get(j)) {
								strike++;
							}else{
								ball++;
							}
						}
					}
					System.out.println("[" + strike + " strike" + ball + " ball");
				}
			
			}
}

/*do {
	 
	strike = 0;
	ball = 0;
	
	System.out.println("숫자를 입력해주세요 > ");
		input.add(sc.nextInt());
		
		if(input.get(0) == num.get(0)) strike++;
		else if(input.get(0) == num.get(1) || input.get(0) == num.get(2))ball++;
		
		if(input.get(1) == num.get(1)) strike++;
		else if(input.get(1) == num.get(0) || input.get(1) == num.get(2))ball++;
		
		if(input.get(2) == num.get(2)) strike++;
		else if(input.get(2) == num.get(0) || input.get(2) == num.get(1))ball++;
		
		System.out.println("[" + strike + " strike" + ball + " ball" + "]");
				
			
}while(strike < 3);*/