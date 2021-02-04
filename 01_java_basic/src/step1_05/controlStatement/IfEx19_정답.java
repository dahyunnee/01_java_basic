package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

//2021.01.21 20:09~20:17
public class IfEx19_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("본인 계좌를 입력하세요 : ");
		int inputmyAcc = scan.nextInt();
		int inputyourAcc = -1; 
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		int inputMoney = -1;
		
		if (inputmyAcc == 1234){
			System.out.print("상대방 계좌를 입력하세요 : ");
			inputyourAcc = scan.nextInt();
			
			if (inputyourAcc == 4321) {
				
				System.out.print("이체할 금액을 입력하세요 : ");
				inputMoney = scan.nextInt();
				System.out.println();
				
				if(inputMoney <= myMoney) {
					System.out.println("이체 가능");
					
					myMoney -= inputMoney;
					yourMoney += inputMoney;
					
				}
				
				else {
					System.out.println("이체 불가능");
				}
				
			}
			
			else {
				System.out.println("이체하실 계좌번호를 다시 확인해주세요");
			}
			
		}
		
		else {
			System.out.println("본인의 계좌번호를 다시 확인해주세요");
		}
		
		
		
		
		System.out.println();
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
	
		
		scan.close();
	}
	

}
