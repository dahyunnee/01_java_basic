package step1_06.loop;

import java.util.Scanner;

/*
 * 
 * 1. key값(기준값)을 입력받아서 저장한다.
 * 2. 반복문을 사용하여 -1을 입력받을때까지 일련의 수를 계속 받는다. -1을 입력받을 경우 종료한다.
 * 3. 위 수 중 key 값이 몇 번째에 포함되어 있는가를 출력하는 프로그램을 작성하시오.
 * 4. 단, key가 여러개 포함되어 있을 경우 앞에 나타난 것의 위치를 출력하시오.
 * 5. key가 일련의 수 안에 없는 경우 "not found"를 출력하시오.
 * 
 * 예) 
 * key 값 입력 : 7
 * 
 * 입력 : 10
 * 입력 : 7
 * 입력 : 20
 * 입력 : 7
 * 입력 : 30
 * 입력 : 7
 * 입력 : 10
 * 입력 : -1
 * 
 * 결과 : key값 7가 첫번재 나타난 것은 2번째 이다.
 * 
 */



public class LoopEx27_테스트문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
		System.out.print("key값 입력 : ");
		int key = scan.nextInt();
		
		int inputNumber = -1;
		int countOrder = 1;		//입력된 수들의 순서 저장 변수 
		int firstAppear = -1;	//첫번째 나타났을때 순서 저장 위한 변수
		
		do {
			
			System.out.print("입력 : ");
			inputNumber = scan.nextInt();
			
			if ( inputNumber == key ) {		//key값과 일치하는 경우
				
				if (firstAppear == -1 ) firstAppear = countOrder;	//처음 등장한 경우에만 firstAppear 값을 
																	//등장한 순서(countOrder)로 바꿔줌 
				
			}
			
			countOrder++;		//일치하지 않는 경우를 위해 countOrder을 1 증가시킴 

			
		}while(inputNumber != -1);
 
		System.out.println();
		
		if ( firstAppear != -1) System.out.println("key값 " + key + "는 " + firstAppear +"번째에서 처음으로 나타남.");
		else System.out.println("not found");
		
		scan.close();
	}

}
