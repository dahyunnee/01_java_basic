package step1_06.loop;

import java.util.Scanner;

/*
 * # 베스킨라빈스31
 * 
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */

//2021.01.28 20:36 ~ 20:48
public class LoopEx11_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;
		
		int winner = 0;
		
		System.out.println("베스킨라빈스 게임을 시작합니다.");
		System.out.println("각 사용자는 1~3 사이의 수를 입력해주세요.");
		while (br < 31) {
			
			System.out.print("p1 [1~3] : ");
			p1 = scan.nextInt();
			
			if ( p1 > 3) {
				System.out.println("[1~3] 사이의 수를 입력하세요. 게임을 다시 진행합니다." );
				br = 0;
			}
			else {
				br += p1;
				System.out.println("누적 숫자는 " + br + "입니다. ");
				
			}
			
			winner = 2;
		
			
		
			if (br <= 31) {
				System.out.print("p2 [1~3] : ");
				p2 = scan.nextInt();

					
				if ( p2 > 3) {
					System.out.println("[1~3] 사이의 수를 입력하세요. 게임을 다시 진행합니다." );
					br = 0;
				}
				else {
					br += p2;
					System.out.println("누적 숫자는 " + br + "입니다. ");
					
				}
				
				winner = 2;
			
				
			}
			
					
		}
		
		if (winner == 1) System.out.println("승리자는 [p1] 입니다.");
		else if (winner == 2) System.out.println("승리자는 [p2] 입니다.");

		scan.close();
	}

}
