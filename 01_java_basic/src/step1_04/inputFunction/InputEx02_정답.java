package step1_04.inputFunction;

import java.util.Scanner;

public class InputEx02_정답 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// 문제1) 숫자 2개를 입력받아서 합 출력
		
		System.out.print("첫 번째 수를 입력하세요 : ");
		int number1 = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 : ");
		int number2 = sc.nextInt();
		
		int sum = number1 + number2;
		System.out.println("숫자 두개의 합 : " + sum);
		
		// 문제2) 숫자 1개를 입력받아서 , 홀수이면 true 출력
		
		System.out.print("수를 입력하세요 : ");
		int number = sc.nextInt();
		
		System.out.println(number % 2 == 1);
		
		// 문제3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		
		System.out.print("성적을 입력하세요 : ");
		int score = sc.nextInt();
		
		System.out.println(score >= 60 && score <= 100);
		
		sc.close();
	}
	
}
