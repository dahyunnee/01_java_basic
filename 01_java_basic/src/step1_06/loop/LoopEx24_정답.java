package step1_06.loop;

/*
 * # 2차원 반복문
 * 
 * 1   2  3  4  5   -> 빼면 0
 * 10  9  8  7  6   -> 더하면11 11 11 11 11
 * 11 12 13 14 15   -> 빼면 10 10 10 10 10 
 * 20 19 18 17 16   -> 더하면 21 21 21 21 21
 * 21 22 23 24 25   -> 빼면 20 20 20 20 20
 * 
 * 
 * 1) 오른쪽방향으로 순서대로 출력
 * 2) 왼쪽방향대로 순서대로 출력
 * 
 * 1)2) 5번 반복
 * 
 */


//2021.02.14 16:18~16:23
public class LoopEx24_정답 {

	public static void main(String[] args) {

		int line = 10;
		int even = 11;
		int odd = 0;
		
		for (int i = 1; i<=5; ++i) {
			
			for ( int j = 1; j<=5 ;++j) {
				
				if (i%2 == 0) {
					
					System.out.print(even - j + " ");
					if (j==5) {
						System.out.println();
						even += 10;
					}
					
				}
				else {
					
					System.out.print(odd + j + " ");
					if (j==5) {
						System.out.println();
						odd += 10;
					}
					
				}
				
		
			}
		}
		
		
	}

}
