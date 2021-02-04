package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 지하철 요금 계산
 * 
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)  ! 여기서부터는 일일이 지정이 아닌 계산식으로 필요함.
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */

//2021.01.21 20:40~20:48
public class IfEx23_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이용할 정거장 수를 입력하세요 : ");
		int countStation = scan.nextInt();
		int totalFee = 0;
		
		if(countStation <= 5) totalFee = 500;
		else if(countStation <= 10) totalFee = 600;
		else {
			countStation -= 10;
			countStation /= 2;
			
			totalFee = 600 + (countStation+1) * 50;
		}
		
		System.out.println("이용하실 요금은 " + totalFee + "원 입니다.");
		
		
		scan.close();
		
	}

}
