package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수찾기[1단계]
 * 
 * 1. 소수란, 1과 자기자신으로만 나눠지는 수
 * 2. 예) 2, 3, 5, 7, 11, 13, ..
 * 3. 힌트
 * 1) 해당 숫자를 1부터 자기자신까지 나눈다.
 * 2) 나머지가 0일 때마다 카운트를 센다.
 * 3) 그 카운트 값이 2이면 소수이다.
 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	소수x
 * 
 * 정수 한 개를 입력받아, 해당 숫자가 소수인지 아닌지 판별한다.
 * 
 */

//2021.01.29 19:10~19:30
public class LoopEx13_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 한개를 입력하세요 : ");
		int discriminateDecimal = scan.nextInt();
		
	
		boolean flag = false;
		int number = 2;
		
		int sqrtDecimal = (int) Math.sqrt(discriminateDecimal);
		
		while (number <= sqrtDecimal) {
			
			if(discriminateDecimal % number == 0) {
				
				number = sqrtDecimal + 1;
				flag = false;
			}
			else {
				
				flag = true;
				number ++;
			}
		}
		
		
		if (flag == true || discriminateDecimal ==2 || discriminateDecimal == 3)
			System.out.println("소수");
		else if (flag == false || discriminateDecimal == 1) System.out.println("소수 아님");
		
		
		scan.close();
	}

}
