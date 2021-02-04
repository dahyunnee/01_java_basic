package step1_05.controlStatement;

import java.util.Random;


/*
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */


//2021.01.21 20:30~20:40
public class IfEx22_정답 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int randomNumber = rand.nextInt(50) + 1;
		
		int count = 0;
		System.out.println(randomNumber);
		
		if (randomNumber / 10 > 0) {  // 10~50 사이의 수
			
			int firstNumber = randomNumber / 10;
			int secondNumber = randomNumber % 10;
			
			if (firstNumber % 3 == 0) count+=1;
			if (secondNumber % 3 == 0) count+=1;
			
			if(count == 2)	System.out.println("짝짝");
			else if(count == 1) System.out.println("짝");
			
		}
		
		else {  //1~9 사이의 수
			
			if (randomNumber % 3 == 0) System.out.println("짝");
			else System.out.println(randomNumber);
			
		}
		
	}

}
