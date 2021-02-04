package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meLeft 에 가위바위보 입력
	meRight 에 가위바위보 입력
	
	comLeft에 가위바위보 입력  (랜덤)
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접)
	comFinal에 comLeft 또는 comRight 저장 (랜덤)
	
	3) 최종판정
*/
public class ifEx29_테스트문제 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		//사용자 입력받아 왼손,오른손 각각 가위바위보 정하기
		System.out.print("왼손 : 가위(1), 바위(2), 보(3) 중 하나를 고르세요 => ");
		int meLeft = scan.nextInt();
		
		System.out.print("오른손 : 가위(1), 바위(2), 보(3) 중 하나를 고르세요 => ");
		int meRight = scan.nextInt();
		
		
		//랜덤으로 컴퓨터의 왼손,오른손 각각 가위바위보 정하기
		int comLeft = rand.nextInt(2) + 1;		
		int comRight = rand.nextInt(2) + 1;
		
		//사용자 왼손,오른손 중 하나 고르기
	
		int randomuserHand = rand.nextInt(2);
		int finaluserHand;
		
		if(randomuserHand == 0) finaluserHand = meLeft;
		else finaluserHand = meRight;
		
		

		//컴퓨터 왼손,오른손 중 하나 고르기
	
		int randomcomputerHand = rand.nextInt(2);
		int finalcomputerHand;
		
		if(randomcomputerHand == 0) finalcomputerHand = comLeft;
		else finalcomputerHand = comRight;
		
		
		//컴퓨터, 유저 각각 왼손, 오른손 결과 도출
		System.out.println();
		System.out.println("You : 오른손 " + meLeft + " / 왼손 : " + meRight);
		System.out.println("Computer : 오른손 " + comLeft + " / 왼손 : " + comRight);
		
		
		
		//하나빼기 실행 between finalcomputerHand, finaluserHand
		
		System.out.println();
		System.out.println("<<하나 빼기 실행>>");
		System.out.println("You : " + finaluserHand +" / Computer : " + finalcomputerHand);
		
		
		if ( (finalcomputerHand + 1) % 3 == finaluserHand) System.out.println("당신이 승리하셨습니다.");
		else if (finalcomputerHand == finaluserHand) System.out.println("비겼습니다.");
		else System.out.println("당신이 졌습니다.");
		
		scan.close();
		
		
		
	}

}
