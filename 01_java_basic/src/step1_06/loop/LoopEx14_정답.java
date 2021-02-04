package step1_06.loop;

import java.util.Scanner;

/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

//2021.01.29 19:23~19:25
public class LoopEx14_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("첫번째 수를 입력하세요 : ");
//		int firstNumber = scan.nextInt();
//		
//		System.out.print("두번째 수를 입력하세요 : ");
//		int secondNumber = scan.nextInt();
//		
//		System.out.print("세번째 수를 입력하세요 : ");
//		int thirdNumber = scan.nextInt();
//	
//		int midNumber = (firstNumber > secondNumber ) ? firstNumber : secondNumber ;
//		
//		int maxNumber = (midNumber > thirdNumber ) ? midNumber : thirdNumber ;

		
		int gameNumber = 1;
		int maxNumber = -1;
		int inputNumber = -1;
		
		while (gameNumber <= 3) {
			
			System.out.print(gameNumber + "번째 숫자를 입력하세요 => ");
			inputNumber = scan.nextInt();
			
			if (maxNumber < inputNumber) {
				maxNumber = inputNumber;
				
			}
			
			gameNumber++;
		}
		
		
		System.out.println("가장 큰 수는 " + maxNumber + "입니다.");
		scan.close();
	}

}

