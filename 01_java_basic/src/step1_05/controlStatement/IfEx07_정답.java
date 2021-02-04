package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 성적 유효성 검사
 * 
 * 1. 성적을 입력받는다.
 * 2. 성적이 60점 이상이면 합격, 60점 미만이면 불합격이다.
 * 3. 단, 입력받은 성적이
 *    음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
 *    예) 성적을 잘못 입력했습니다.
 */


//2021.01.15 20:39~20:42
public class IfEx07_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적을 입력하세요 : ");
		int myScore = sc.nextInt();
		
		if(myScore >= 60 && myScore <= 100) System.out.println("합격");
		if(myScore < 60 && myScore >= 0) System.out.println("불합격");
		if(myScore > 100 || myScore < 0) System.out.println("성적을 잘못 입력했습니다");
		
		sc.close();
	}

}
