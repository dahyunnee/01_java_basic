package step1_01.print;

public class PrintEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1) 자료형(data type)에 맞는 출력
		
		// 1-1) 정수 : 소숫점이 없는 수
		System.out.println(10);
		
		// 1-2) 실수 : 소숫점이 있는 수
		System.out.println(3.14);
		
		// 1-3) 문자 : 단일문자
		System.out.println('a');  //홑따옴표, 싱글쿼터, 싱글쿼테이션
		
		// 1-4) 문자열 : 글자
		System.out.println("abc");  //쌍따옴표, 더블쿼터, 더블쿼테이션
		System.out.println();
		
		// 2) 복수의 데이터 출력 (,가 아닌 + 사용해야함)
		System.out.println(1 + 3 + 5);
		System.out.println(1 + "" + 3 + "" + 5);
		System.out.println(1 + " " + 3 + " " + 5);
		System.out.println(1 + " , " + 3 + " , " + 5);
		
		// 2-1) 문자열 + 문자열 = 문자열
		System.out.println("3" + "7");
		// 2-2)숫자 + 숫자 = 숫자
		System.out.println(3+7);
		// 2-3)문자열 + 숫자 = 문자열
		System.out.println("3"+7);
		// 2-4)숫자 + 문자열 = 문자열
		System.out.println(3+"7");
		
		System.out.println("더하기 = "+3+7);
		System.out.println("더하기 = "+(3+7));   
	
	
	}

}
