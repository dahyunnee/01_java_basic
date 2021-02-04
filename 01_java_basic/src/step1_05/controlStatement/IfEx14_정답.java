package step1_05.controlStatement;

import java.util.*;


/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

//2021.01.19 20:44~20:45
public class IfEx14_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int coin = ran.nextInt(2);
		
		System.out.print("0(앞면) 또는 1(뒷면)을 입력해주세요 : ");
		int myNumber = scan.nextInt();
		
		if (myNumber == coin) System.out.println("정답");
		if (myNumber != coin) System.out.println("땡");


	}

}
