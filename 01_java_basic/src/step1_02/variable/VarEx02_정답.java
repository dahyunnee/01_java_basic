package step1_02.variable;

// 산술 연산자 하고 와서 진행
public class VarEx02_정답 {

	public static void main(String[] args) {
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		
		int cash = 1000;
		int snack = 200;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		
		int monthlyMoney = 100;
		double tax = 0.9;
		double salary = 12 * tax * monthlyMoney;
		System.out.println("연봉 = " + salary);
		
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		int score1 = 30;
		int score2 = 50;
		int score3 = 4;
		double average = (score1 + score2 + score3)/3;
		System.out.println("평균 = "+ average);
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int horizontal = 3;
		int vertical = 6;
		double triangleArea = horizontal * vertical /2;
		System.out.println("넓이 = " + triangleArea);
		
		//문제4) 100초를 1분 40초로 출력
		int seconds = 100;
		int secondstoMinutes = seconds / 60;
		int secondstoSeconds = seconds % 60;
		System.out.println(secondstoMinutes + "분 " + secondstoSeconds + "초");
		
	
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원(1개), 100원(3개) 
		int sumMoney = 800;
		int numberof500 = sumMoney / 500;
		int numberof100 = ( sumMoney % 500 ) / 100;
		System.out.println("500원 = " + numberof500 + "개, 100원 = " + numberof100 + "개");


	}

}
