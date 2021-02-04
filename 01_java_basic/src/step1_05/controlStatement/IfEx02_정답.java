package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # Up & Down 게임[1단계]
 * 
 * 1. com은 8이다.
 * 2. me는 com의 숫자를 맞추는 게임이다.
 * 3. 다음과 같은 메세지를 출력한다.
 * 1) me < com	: Up!
 * 2) me == com : Bingo!
 * 3) me > com  : Down!
 */

// 2021.01.15 20:00 ~ 20:05
public class IfEx02_정답 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int com = 8;	
		
		System.out.print("정수를 입력하세요 : ");
		int myNumber = sc.nextInt();
		
		if (myNumber < com) System.out.println("Up!");
		if (myNumber == com) System.out.println("Bingo!");
		if (myNumber > com) System.out.println("Down!");
		
		sc.close();
	}

}
