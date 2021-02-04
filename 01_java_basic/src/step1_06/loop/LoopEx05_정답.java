package step1_06.loop;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */

//2021.01.26 20:32 ~ 20:
public class LoopEx05_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		int numberofOrder = 0;
		
		int numberofMenu1 = 0;
		int numberofMenu2 = 0;
		int numberofMenu3 = 0;
		
		int userMenu = -1;
	
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");

		
		while (numberofOrder < 5) {
			System.out.print("메뉴 선택 : ");
			userMenu = scan.nextInt();
			
			if(userMenu == 1) {
				numberofMenu1++;
				numberofOrder++;
			}
			else if(userMenu == 2) {
				numberofMenu2++;
				numberofOrder++;
			}
			else if(userMenu == 3) {
				numberofMenu3++;
				numberofOrder++;
			}
			else System.out.println("메뉴를 다시 골라주세요");
			
		}
		
		int sumofPrice = numberofMenu1 * price1 + numberofMenu2 * price2 + numberofMenu3 * price3;
		System.out.println("총 금액 = " + sumofPrice);
		
		System.out.print("현금입력 : ");
		int inputMoney = scan.nextInt();
		
		
		/* 예)
		 * 메뉴 선택 : 1
		 * 메뉴 선택 : 1
		 * 메뉴 선택 : 2
		 * 메뉴 선택 : 2
		 * 메뉴 선택 : 3
		 * 총 금액 = 31300원
		 * 현금 입력 : 32000
		 * === 롯데리아 영수증 ===
		 * 1. 불고기 버거 : 2개
		 * 2. 새우    버거 : 2개
		 * 3. 콜         라 : 1개
		 * 4. 총   금   액 : 31300원
		 * 5. 잔         돈 : 700원
		 */
		
		System.out.println("=== 롯데리아 영수증 ===");
		System.out.println("1. 불고기 버거 : " + numberofMenu1 + "개");
		System.out.println("2. 새우   버거 : " + numberofMenu2 + "개");
		System.out.println("3. 콜       라 : " + numberofMenu3 + "개");
		System.out.println("4. 총  금  액 : " + sumofPrice + "원" );
		System.out.println("5. 잔      돈 : " + (inputMoney - sumofPrice) + "원");
		
		
		scan.close();
	}

}
