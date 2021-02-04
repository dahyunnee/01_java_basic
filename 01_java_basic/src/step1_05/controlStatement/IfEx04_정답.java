package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 로그인[1단계]
 * 
 * 1. Id와 Pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 */

// 2021.01.15 20:11~20:13
public class IfEx04_정답 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;

		System.out.print("Id를 입력하세요 : ");
		int myId = sc.nextInt();
		System.out.print("Pw를 입력하세요 : ");
		int myPw = sc.nextInt();
		
		if (myId == dbId && myPw == dbPw) System.out.println("로그인 성공");
		if (myId != dbId || myPw != dbPw) System.out.println("로그인 실패");
		
		sc.close();
	}

}
