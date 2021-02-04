package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 
 */

//2021.01.28 19:21~19:44
public class LoopEx08_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		boolean isRun = true;
		
		int inputAcc = -1;
		int inputPw = -1;
		
		
		
		while (isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			System.out.println();
			int selectMenu = scan.nextInt();
			
			
			if (selectMenu == 1) {
				
				if (identifier == -1 ) {
					
					System.out.println("로그아웃 상태입니다.");
					System.out.print("아이디를 입력하세요 : ");
					inputAcc = scan.nextInt();
					System.out.print("비밀번호를 입력하세요 : ");
					inputPw = scan.nextInt();
					
					if (inputAcc == dbAcc1 && inputPw == dbPw1) identifier = 1;
					else if (inputAcc == dbAcc2 && inputPw == dbPw2) identifier = 2;
					else System.out.println("아이디와 비밀번호를 다시 입력하세요");
					
				}
				
				else System.out.println("재 로그인 불가입니다. 로그아웃 상태에서만 "
						+ "로그인 가능합니다");
				
				System.out.println();
			}
			else if (selectMenu == 2) {
				
				if( identifier == -1) {

					System.out.println("로그인 후 이용해 주세요.");
					System.out.println();
				}
				
				else {
					
					identifier = -1;
					System.out.println("로그아웃 되었습니다.");
					System.out.println();
					
				}
				
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
				System.out.println();
			}
		}

		scan.close();
	}

}
