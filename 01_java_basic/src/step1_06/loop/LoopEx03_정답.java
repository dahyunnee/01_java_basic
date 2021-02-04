package step1_06.loop;

//# 반복문 기본문제[2단계]

//2021.01.26 20:20 ~ 20:24
public class LoopEx03_정답 {

	public static void main(String[] args) {
		
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		
		int i1 = 1;
		int sum = 0;
		
		while ( i1 <= 5 ) {
			sum += i1;
			++i1;
		}
		
		System.out.println(sum);
		System.out.println();
		
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		
		int i2 = 1;
		
		while (i2 <= 10) {
			
			if (i2 < 3 || i2 >= 7) {
				System.out.println(i2);
			}
			
			i2++;
			
		}
		
		System.out.println();
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		
		int i3 = 1;
		int sumofI3 = 0;
		
		while (i3 <= 10) {
			
			if (i3 < 3 || i3 >= 7) {
				sumofI3 += i3;
			}
			
			i3++;
			
		}
		
		System.out.println(sumofI3);
		System.out.println();
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		
		int i4 = 1;
		int numberofI4 = 0;
		
		while (i4 <= 10) {
			
			if (i4 < 3 || i4 >= 7) {
				numberofI4++;
			}
			
			i4++;
			
		}
		System.out.println(numberofI4);
		System.out.println();

	}

}
