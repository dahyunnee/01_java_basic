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
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 * 
 */

//2021.01.28 20:13 ~ 20:35
public class LoopEx10_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		int inputAcc = 0;		
		int inputPw = 0;
		
		int inputMoney = 0;	
		int withdrawal = 0;
		
		int transferAcc = 0;	//이체할 계좌번호 
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				if (identifier == -1) {
					System.out.println("로그아웃 상태. 로그인 가능합니다. ");
					
					System.out.print("아이디를 입력하세요 : ");
					inputAcc = scan.nextInt();
					
					System.out.print("비밀번호를 입력하세요 : ");
					inputPw = scan.nextInt();
					
					
					if(inputAcc == dbAcc1 && inputPw == dbPw1) identifier = 1;
					else if(inputAcc == dbAcc2 && inputPw == dbPw2) identifier = 2;
					else System.out.println("아이디와 비밀번호를 다시 입력하세요.");
					
				}
				
				else {
				
					System.out.println("재로그인 불가합니다");
					if (identifier == 1 ) System.out.println("현재 로그인 아이디는 " + dbAcc1 + "입니다.");
					if (identifier == 2 ) System.out.println("현재 로그인 아이디는 " + dbAcc2 + "입니다.");
				
				}
				
				System.out.println();
			}
			
			else if (sel == 2) {
				
				if (identifier != -1) {
					System.out.println("현재 로그인 상태. 로그아웃을 실행합니다. ");
					identifier = -1;
					System.out.println("로그아웃 완료. ");
				}
				
				else {
					System.out.println("로그인을 먼저 실행해주세요.");
				}
				
				System.out.println();
			}
			
			else if (sel == 3) {
				
				System.out.print("입금하실 금액을 입력하세요 : ");
				inputMoney = scan.nextInt();
				
				if(identifier == 1 ) {
					dbMoney1 += inputMoney;
					System.out.println("입금완료.");
				}
				else if(identifier == 2) {
					dbMoney2 += inputMoney;
					System.out.println("입금완료.");
				}
				else System.out.println("로그인을 먼저 실행해주세요.");
				
				System.out.println();
			}
			
			else if (sel == 4) {
				
				System.out.print("출금하실 금액을 입력하세요 : ");
				withdrawal = scan.nextInt();
				
				if(identifier == 1 ) {
					
					if (withdrawal > dbMoney1) System.out.println("잔액부족. 출금불가");
					else {
						dbMoney1 -= withdrawal;
						System.out.println("출금완료.");
					}
					
				}
				else if(identifier == 2) {
					
					if (withdrawal > dbMoney2) System.out.println("잔액부족. 출금불가");
					else {
						dbMoney2 -= withdrawal;
						System.out.println("출금완료.");
					}
					
				}
				else System.out.println("로그인을 먼저 실행해주세요.");
				
				System.out.println();
				
			}
			else if (sel == 5) {
				
				System.out.print("이체하실 계좌번호를 입력하세요 : ");
				transferAcc = scan.nextInt();
				
				
				
				
				if (transferAcc == 1111) {
					
					System.out.print("이체하실 금액을 입력하세요 : ");
					inputMoney = scan.nextInt();
					
					if (dbMoney1 < inputMoney ) System.out.println("잔액부족. 이체불가능. ");
					else {
						dbMoney1 += inputMoney;
						dbMoney2 -= inputMoney;
						
						System.out.println("계좌번호 [1111]로 " + inputMoney + "원을 이체하였습니다.");
					}
					
				}
				else if(transferAcc == 2222) {
					
					System.out.print("이체하실 금액을 입력하세요 : ");
					inputMoney = scan.nextInt();
					
					if (dbMoney2 < inputMoney ) System.out.println("잔액부족. 이체불가능. ");
					else {
						dbMoney1 -= inputMoney;
						dbMoney2 += inputMoney;
						
						System.out.println("계좌번호 [2222]로 " + inputMoney + "원을 이체하였습니다.");
					}
					
				
					
				}
				
				else System.out.println("계좌번호가 잘못 되었습니다. ");
				
				System.out.println();
			}
			else if (sel == 6) {
				
				System.out.print("잔액을 조회하실 계좌번호를 입력하세요 : ");
				
				inputAcc = scan.nextInt();
				
				if (inputAcc == 1111) System.out.println("계좌번호 [1111]의 잔액은 " + dbMoney1 +"원 입니다.");
				else if (inputAcc == 2222) System.out.println("계좌번호 [2222]의 잔액은 " + dbMoney2 +"원 입니다.");
				else System.out.println("계좌번호가 잘못 되었습니다.");
			
				System.out.println();
				
			}
			else if (sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}
	
		scan.close();
		
	}

}
