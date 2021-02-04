package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */

//2021.01.26 20:25 ~ 20:31
public class LoopEx04_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		int numberofGame = 0;
		int firstNumber = 0;
		int secondNumber = 0;
		int resultofUser = -1;
		int score = 0;
		
		while (numberofGame < 5) {
		
			firstNumber = rand.nextInt(9) + 1;
			secondNumber = rand.nextInt(9) + 1;
			
			System.out.print(firstNumber + " * " + secondNumber + " = ");
			resultofUser = scan.nextInt();
			
			if ( resultofUser == firstNumber * secondNumber ) {
				score += 20;
			}
			
			numberofGame ++;
			
		}

		System.out.println("점수는 " + score + "입니다");
		
		scan.close();
		
	}

}
