package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 구구단 게임[1단계]
 * 
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */


//2021.01.15 20:37~20:38
public class IfEx06_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int number1 = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int number2 = sc.nextInt();
		
		int answer = number1 * number2;
		
		System.out.print("정답을 입력하세요 : ");
		int myAnswer = sc.nextInt();
		
		if(answer == myAnswer) System.out.println("정답");
		if(answer != myAnswer) System.out.println("땡");
		
		sc.close();

	}

}
