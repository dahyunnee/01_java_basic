package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 
 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


//2021.01.15 20:32~20:36
public class IfEx05_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		
		System.out.print("회원가입을 위한 Id를 입력하세요 : ");
		dbId = sc.nextInt();
		System.out.print("회원가입을 위한 Pw를 입력하세요 : ");
		dbPw = sc.nextInt();
		
		
		System.out.print("로그인을 위한 Id를 입력하세요 : ");
		int myId = sc.nextInt();
		System.out.print("로그인을 위한 Pw를 입력하세요 : ");
		int myPw = sc.nextInt();
		
		if(dbId == myId && dbPw == myPw) System.out.println("로그인 성공");
		if(dbId != myId || dbPw != myPw) System.out.println("로그인 실패");
		
		sc.close();
		
	}

}
