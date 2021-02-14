package step1_06.loop;

/*
 * 
 *  # 삼각형 출력하기
 * 
 *         1                     1         -> 빈칸8개 후 1 이 1번 등장 
 *        2 2 
 *       3 3 3
 *      4 4 4 4
 *     5 5 5 5 5
 *    6 6 6 6 6 6 
 *   7 7 7 7 7 7 7       __7_7_7_7_7_7_7__  -> 빈칸2개 후 7이 일곱번 등장
 *  8 8 8 8 8 8 8 8      _8_8_8_8_8_8_8_8_
 * 9 9 9 9 9 9 9 9 9     9_9_9_9_9_9_9_9_9   -> 빈칸 0개 후 9가 아홉번 등장 
 * 
 * 
 * 
*/

public class LoopEx28_테스트문제 {

	public static void main(String[] args) {

		
		
		for (int row = 1; row < 10; ++row) {  //9행 반복
			
			
			int blank = 9;
			
			
			for ( int space = 1; space + row <= 9 ; space ++) {		//빈칸 처리 
				
				System.out.print(" ");
			}
			
			
			for ( int number = row; number > 0 ; --number) {		//숫자나오는 부분 처리
				
				System.out.print(row + " ");
			}
			
			
			System.out.println();
		}
		
		

	}

}
