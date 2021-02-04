package step1_05.controlStatement;

import java.util.Random;


/*
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */

//2021.01.21 18:52~18:55
public class IfEx15_정답 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int randNumber = rand.nextInt(10);
		
		if(randNumber <= 2)	System.out.println("당첨");
		if(randNumber > 2)	System.out.println("꽝");
		
	}

}
