package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수 찾기[3단계]
 * 
 * 1. 숫자를 한 개 입력받는다.
 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
 * 
 * 예) Enter Number ? 1000
 *    1000보다 큰 첫번재 소수는 1009
 * 예) Enter Number ? 500
 *    500보다 큰 첫번째 소수는 503
 *    
 */


public class LoopEx26_테스트문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int getNumber = scan.nextInt();
		
		int sqrtNumber = -1; 
		
		
		for ( int standardNumber = getNumber ; ; standardNumber++ ) {
			
			boolean isPrimenumber = true;
	
			sqrtNumber = (int)Math.sqrt(standardNumber);
			
			for ( int i = 2; i <= sqrtNumber ; ++i) {		//소수인지 확인
				
				if (standardNumber % i == 0) { 	//소수 아님 
					
					isPrimenumber = false;
					break;
				}
				
			}
			
			
			if (isPrimenumber == true ) {	//소수인 경우 출력하고 종료
				
				System.out.println(standardNumber);
				break;
			}
			
			
		}
		
		
		scan.close();
		
	}

}
