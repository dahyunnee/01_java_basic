package step1_06.loop;

/*
 
	# 문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
	# 답 : 63
	
	# 문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
	# 답 149
	
	# 문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
	# 답 6 (54,63,72,81,90,99)
	
	# 문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
	# 답 980
	
	# 문제5) 8의 배수를 작은수부터 5개 출력
	# 답 : 0,8,16,24,32
	
*/

public class LoopEx25_테스트문제 {

	public static void main(String[] args) {

		
		// 문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
		
		int number = 1;
		int multiple_9 = 1;
		
		do {
			
			multiple_9 = 9 * number;
			number ++;
			
		}while((int)(multiple_9 / 10) != 6);
	
		System.out.println("1. 답: " + multiple_9);
		
		//문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
		// 5, 13, 21, 29 ,... 
		
		int number2 = 1;

		while ( number2 < 150 ) {
			
			if (number2 % 8 == 5 ) {
				
				number2 += 8;
				
			}
			
			else number2 += 1;
			
		}
		
		System.out.println("2. 답: " + (number2 - 8));
		
		
		//문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
		
		
		int count_9 = 0;
		
		for (int number3 = 50 ; number3 <= 100; ) {
			
			if (number3 % 9 == 0) {
				
				count_9 ++;
				number3 += 9;
			}
			
			else number3 ++;
			
			
		}
		
		System.out.println("3. 답: " + count_9);
		
		// # 문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.

		int number4;
		
		for ( number4 = 100; number4 < 1000; ) {
			
			if (number4 % 28 == 0) {
				
				number4 += 28;
			}
			
			else number4 ++;
		}
		
		System.out.println("4. 답: " + (number4 - 28));
		
		
		
		//문제5) 8의 배수를 작은수부터 5개 출력
		
		
		int count2 = 0;
		int number5 = 8;
		
		System.out.print("5. 답: ");
		
		while (count2 < 5) {
			
			number5 = 8 * count2;
			
			System.out.print(number5 + " ");
			count2++;
			
		}
	}

}
