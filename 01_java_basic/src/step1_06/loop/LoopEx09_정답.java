package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 * 
 */

//2021.01.28 20:02 ~ 20:13
public class LoopEx09_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean isRun = true;
		
		int inputMoney;
		int withdrawal;
		
		int inputAcc;
	
		
		while(isRun) {
			

			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			
			if (selectMenu == 1) {
				
				System.out.print("입금할 금액을 입력하세요 : ");
				inputMoney = scan.nextInt();
				
				myMoney += inputMoney;
				
				System.out.println("입금완료.");
				System.out.println();
				
			}
			else if (selectMenu == 2) {
				
				System.out.print("출금할 금액을 입력하세요 : ");
				withdrawal = scan.nextInt();
				
				if (withdrawal > myMoney ) System.out.println("잔액부족. 출금불가");
				else {
					myMoney -= withdrawal;
					System.out.println("출금완료");
				}
				
				System.out.println();
			} 
			else if (selectMenu == 3) {
				
				System.out.print("입금할 계좌의 계좌번호를 입력하세요 : ");
				inputAcc = scan.nextInt();
				
				if (inputAcc == yourAcc) {
					
					System.out.print("입금하실 금액을 입력하세요 : ");
					inputMoney = scan.nextInt();
					
					if(inputMoney > myMoney) System.out.println("잔액부족. 출금불가");
					else {
						
						System.out.println("이체 완료.");
						myMoney -= inputMoney;
						yourMoney += inputMoney;
						
					}
				}
				
				else System.out.println("계좌번호 오류");
				
				System.out.println();
				
			}
			else if (selectMenu == 4) {
				
				System.out.println("계좌번호 [1111]의 잔액 : " + myMoney + "입니다.");
				System.out.println("계좌번호 [2222]의 잔액 : " + yourMoney + "입니다.");
				System.out.println();
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
