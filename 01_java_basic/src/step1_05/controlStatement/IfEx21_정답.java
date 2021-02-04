package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249	: 4
 * 	    123 : 2
 * 		771 : 7
 */


//2021.01.21 20:18~20:25
public class IfEx21_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		Random rand = new Random();  
		
		int randomNumber = rand.nextInt(101) + 150;

		System.out.print("가운데 숫자를 입력하세요 : ");
		int guessMidnumber = scan.nextInt();

		//System.out.println(randomNumber);
		randomNumber %= 100;
		//System.out.println(randomNumber);
		
		randomNumber /= 10;
		//System.out.println(randomNumber);
		
		if(randomNumber == guessMidnumber) System.out.println("정답");
		else System.out.println("틀렸습니다. 정답은 " + randomNumber + "입니다.");
		
		scan.close();
	}

}
