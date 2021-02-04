package step1_06.loop;

/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */


//2021.01.29 19:03~19:09
public class LoopEx12_정답 {

	public static void main(String[] args) {
	
		
		int gameNumber = 1;
		int spareNumber = -1;
		int share = -1;
		
		while (gameNumber <= 50) {
			
			spareNumber = gameNumber % 10;
			share = gameNumber / 10;
			
			if (share % 3 == 0 && share != 0) {
				System.out.print("짝짝" + " ");
			}
			
			else if (spareNumber % 3 == 0 && spareNumber != 0) {
				System.out.print("짝" + " ");
			}
		
			else System.out.print(gameNumber + " ");
			
			gameNumber ++;
			
		}
		
		
		
	}

}
