package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

//2021.01.21 20:00~20:07
public class IfEx18_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		int com = 0;	// 랜덤으로 저장
		int me = 0;		// 키보드로 입력받아 저장
		
		System.out.print("가위 (0), 바위 (1), 보 (2) 중 하나를 입력하세요 : ");
		me = scan.nextInt(); 
		
		com = rand.nextInt(3);  
		
		if ( (me+1)%3 == com ) System.out.println("졌습니다.");
		else if ( me == com) System.out.println("비겼습니다.");
		else System.out.println("이겼습니다.");
		
		
		scan.close();
		
	}

}
