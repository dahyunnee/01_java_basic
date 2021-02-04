package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 카카오 택시
 * 
 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
 * 3. 메뉴는 아래와 같다.
 * 		1) 방향설정 : 동(1)서(2)남(3)북(4)
 * 		2) 속도설정 : 1~3까지만 가능
 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다.
 * 예) 1(50) 2(50) 3(100) 4(100) ...
 * 
 * 
 * 
 */

public class LoopEx16_테스트문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		// 목적지(destination)
		int desX = rand.nextInt(21) - 10;  
		int desY = rand.nextInt(21) - 10;
		
		
		// 현재 위치
		int x = 0;
		int y = 0;
		
		// 방향(direction)
		int dir = 0;
		char xaxis = 'a';
		char yaxis = 'a';
		
		// 속도
		int speed = 0;
		
		// 요금
		int fee = 0;
		int block = 0;
		
		boolean isRun = true;
		
		while (isRun) {
			
			System.out.println("= 카카오 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("============");
			
			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				
				System.out.print("동(1)서(2)남(3)북(4) 중 하나를 고르세요 => ");
				dir = scan.nextInt();
				
				switch (dir) {
				case 1:
					xaxis = '+';
					break;
					
				case 2:
					xaxis = '-';
					break;
					
				case 3:
					yaxis = '-';
					break;
					
				case 4:
					yaxis = '+';
					break;
				}
			}
			else if (selectMenu == 2) {
				
				System.out.print("속도 (1~3) 을 고르세요 => ");
				speed = scan.nextInt();
				
				if(speed > 3 || speed < 1) System.out.println("속도를 다시 설정하세요 [1~3]");
				else {
					
				}
				
			}
			else if (selectMenu == 3) {
				//이동하기
				
				if (yaxis == 'a') {			//동 or 서
					
					if (xaxis == '+') {	//동
						
						x += speed;
						
					}
					else if (xaxis == '-') {	//서
						
						x -= speed;
						
					}
					
					xaxis = 'a';
				}
				else if(xaxis == 'a') {		//남 or 북
					
					if (yaxis == '+') {	//남
						
						y += speed;
						
					}
					else if (yaxis == '-') {	//북
						
						y -= speed;
						
					}
					
					yaxis = 'a';
				}
				
				block += speed;
				dir = 0;
				speed = 0;
			}
			
			System.out.println();
			//while문 빠져나가는 조건. 즉, 목적지 도착
			if (x == desX && y == desY) isRun = false;
			
		}

		System.out.println();
		//요금계산
		fee = ( block / 2 ) * 50;
		System.out.println("요금은 " + fee + "원 입니다. ");
		
		scan.close();

	}

}
