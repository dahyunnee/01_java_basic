package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 
 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2) 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3) 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4) 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

//2021.01.26 18:40 ~ 18:49
public class IfEx24_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		int firstNumber = rand.nextInt(10)+1;
		int secondNumber = rand.nextInt(10)+1;
		int operator = rand.nextInt(4)+1;
		
		
		int resultofFormula = -1;
		int systemResult = 0;
		int userResult = 0;
		
		System.out.println("물음표에 들어갈 연산자를 맞추세요");
		System.out.println("1) + 2) - 3) * 4) %");
		
		
		if (operator == 1) {
			
			resultofFormula = firstNumber + secondNumber;
			systemResult = 1;
			
		}
		else if (operator ==2) {
			
			resultofFormula = firstNumber - secondNumber;
			systemResult = 2;
			
		}
		else if (operator == 3) {
			
			resultofFormula = firstNumber * secondNumber;
			systemResult = 3;
			
		}
		else {
			
			resultofFormula = firstNumber % secondNumber;
			systemResult = 4;
			
		}
		
		System.out.println(firstNumber + " ? " + secondNumber + " = " + resultofFormula );
		System.out.print("답 = > ");
		userResult = scan.nextInt();
		
		if(userResult == systemResult) System.out.println("정답입니다");
		else System.out.println("오답입니다. 정답은 " + systemResult + "입니다");
	
		
		scan.close();
	}

}
