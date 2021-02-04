package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

//2021.01.28 19:10~19:21
public class LoopEx07_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(100) + 1;
		
		System.out.print("정수를 입력하세요 : ");
		int inputNumber = scan.nextInt();
		
		int sumofScore = 100;
		
		while(inputNumber != randomNumber && sumofScore >=0) {
			
			
				sumofScore -= 5;
				System.out.print("정수를 입력하세요 : ");
				inputNumber = scan.nextInt();
				
				
			
		}
		
		if(sumofScore < 0) sumofScore = 0;
		
		System.out.println();
		
		System.out.println("최종 점수는 " + sumofScore + "입니다.");
		System.out.println("정답은 " + randomNumber + "입니다");
		
	}

}
