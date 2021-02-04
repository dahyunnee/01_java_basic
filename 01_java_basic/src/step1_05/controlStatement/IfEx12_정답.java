package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */

//2021.01.19 19:38 ~ 19:43
public class IfEx12_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int firstNumber = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int secondNumber = scan.nextInt();
		
		System.out.print("세번째 숫자를 입력하세요 : ");
		int thirdNumber = scan.nextInt();
		
		int midNumber = firstNumber > secondNumber ? firstNumber : secondNumber;
		
		int maxNumber = midNumber > thirdNumber ? midNumber : thirdNumber;
		
		System.out.println("가장 큰 수 : " + maxNumber);
		
		//int midNumber = Math.max(firstNumber, secondNumber);
		//int maxNumber = Math.max(midNumber, thirdNumber);
		
		scan.close();

	}

}
