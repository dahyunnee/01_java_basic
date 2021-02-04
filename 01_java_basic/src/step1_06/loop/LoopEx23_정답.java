package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수찾기[2단계]
 * 
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */


//2021.02.02 20:30 ~ 20:44
public class LoopEx23_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 한개를 입력하세요 : ");
		int inputNumber = scan.nextInt();
		boolean flag;
		
		
		for ( int i = 2; i <= inputNumber ; ++i) {
			flag = false;
			int number = (int)Math.sqrt(i);
			
			if (i==2 || i==3) {
				System.out.println(i + " ");
				continue;
			}
				
			for ( int j = 2; j <= number ; ++j) {
				
				if ( i % j == 0) {
					flag = true;
					break;
				}
				
				
			}
			
			if ( flag == false ) System.out.println(i + " ");
			
		}
		
		scan.close();
		
	}
	
}
