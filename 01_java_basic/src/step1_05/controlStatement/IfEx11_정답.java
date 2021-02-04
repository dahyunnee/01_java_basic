package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */

//2021.01.19 19:30 ~ 19:37
public class IfEx11_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우   버거 : " + price2 + "원");
		System.out.println("3.콜       라 : " + price3 + "원");

		System.out.print("메뉴의 번호를 입력하세요 : ");
		int menuNumber = scan.nextInt();
		
		System.out.print("현금을 입력하세요 : ");
		int myMoney = scan.nextInt();
		
		int charge = 0;
		
		if (menuNumber == 1 )	charge = myMoney - price1;
		if (menuNumber == 2 )	charge = myMoney - price2;
		if (menuNumber == 3 )	charge = myMoney - price3;
		
		if( charge <0 ) System.out.println("현금이 부족합니다");
		else System.out.println("잔돈 : " + charge);
			
		
		
		/*
		 * if ( menuNumber == 1) {
			if (myMoney < 8700) System.out.println("현금이 부족합니다.");
			if (myMoney >= 8700) System.out.println("결제 가격 : " + myMoney + 
					", 잔돈 : " + (myMoney - price1));
			
		}
		 */
		
		scan.close();

	}

}
