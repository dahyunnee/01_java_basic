package step1_06.loop;

import java.util.Random;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

//2021.01.29 19:35~19:42
public class LoopEx15_정답 {

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		
		int sumofScore = 0;
		int countPass = 0;
		int maxScore = 0;
		int number = 1;
		int maxStudent = -1;
		
		
		while(number <= 10) {
			
			int studentScore = rand.nextInt(100) + 1;
			
			sumofScore += studentScore;
			
			//maxScore = (maxScore > studentScore) ? maxScore : studentScore ;
			
			if (studentScore >= 60) countPass++;
			if (maxScore < studentScore) {
				
				maxScore = studentScore;
				maxStudent = number;
			}
			
			System.out.println(number + "번의 성적은 " + studentScore +"점 입니다.");
			
			number ++;
			
		}
		
		int averageScore = sumofScore / 10;
		
		System.out.println();
		System.out.println("전교생의 총점은 " + sumofScore +"점 이고, 평균은 " + averageScore +"점 입니다. ");
		System.out.println("합격자 수는 " + countPass + "명 입니다.");
		System.out.println("1등 학생은 " + maxStudent +"번이고, 성적은 " + maxScore +"점 입니다.");
		
	}

}
