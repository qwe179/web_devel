package java05_array;

import java.util.Scanner;

public class Array_Quiz01 {
	
	public static void main(String[] args) {
		

//5층인 건물의 인원을 입력 받도록 만든후 전체 인원이
//나오도록 하게 하여라.
//그후 각 층마다 관리비를 측정한다.
//(관리비는 인원당 12000원 이다.)
//
//힌트 . 
//- 필요한 배열
// 1. 각층의 사는 인원을 담는 배열 arr[6]
//   // 1~5층 과 총인원 
//   (마지막 배열공간은 입력받은 인원의 총 합으로 사용) 
//
// 2. 각층의 관리비 배열 arr2[6]
//   // 1~5층 과 총 관리비 금액 
//   (마지막 배열공간은 관리비의 총 합계금액으로 사용)
//
//----------------------- 입력 (입력시 for문을 이용한다.)
//1층의 사는 인원은 ? 4
//2층의 사는 인원은 ? 5
//3층의 사는 인원은 ? 11
//4층의 사는 인원은 ? 2
//5층의 사는 인원은 ? 81
//----------------------- 출력 (출력시 for 문을 이용한다.)
//1층의 총 관리비 : 48000원
//2층의 총 관리비 : 60000원
//3층의 총 관리비 : 132000원
//4층의 총 관리비 : 24000원
//5층의 총 관리비 : 96000원
//
//건물에 사는 총 인원은 30명입니다.
//관리비의 총 금액은 360000원 입니다.
	
		/*
		System.out.println("--------------------------");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		int[] arr2 = new int[6];
	
		for(int i=0;i<5; i++) {
			System.out.print((i+1)+"층의 사는 인원은? ");
			arr[i] =sc.nextInt();
			arr[5]+=arr[i];
		}
		
		System.out.println("--------------------------");
		for(int i=0;i<5; i++) {
			arr2[i] = arr[i]*12000;
			System.out.print((i+1)+"층의 총 관리비 : " + arr2[i]);
			System.out.println();
			arr2[5] +=arr2[i];
			
		}
		//건물에 사는 총 인원은 30명입니다.
		System.out.println("건물에 사는 총 인원은 " + arr[5] +"명입니다.");
		//관리비의 총 금액은 360000원 입니다.
		System.out.println("관리비의 총 금액은 " + arr2[5] +"원 입니다.");
*/
		
		
		//----------상수 선언 --------------
		//고정으로 사용하는 값
		//자주사용되는 값
		
		final int FLOOR = 5;//건물의 층수
		final int FEE = 12000;//인당 관리비
		//---------------------------------
		
		
		
		//---------변수 선언 --------------
		int[] people = new int[FLOOR+1];//각 층 인원 + 총 인원
		int[] expense = new int[FLOOR+1]; //각 층 관리비 + 총 관리비
		Scanner sc = new Scanner(System.in); //표준입력객체
		//---------------------------------
		
		
		//--------인원 입력 ---------------
		System.out.println("- - - 각 층의 인원 입력 - - -");
		for(int i = 0; i<FLOOR; i++) { //i, 0~FLOOR-1
			System.out.print(">>" + (i+1) + "층의 인원은?");
			people[i] = sc.nextInt(); //각 층의 인원 입력
			
			//총인원 계산
			people[FLOOR]+= people[i];
			
		}
		//---------------------------------
		//TEST
//		for(int i=0; i<people.length; i++) {     //테스트 완료되면 주석처리
//			System.out.println(people[i]);
//		}

		//--------관리비 계산 -------------
		
		for(int i=0; i<expense.length;i++) {
			expense[i] = people[i]*FEE;
		}
		
		//TEST - 관리비 계산 테스트..
//		for(int i=0; i<expense.length; i++) {     //테스트 완료되면 주석처리
//		System.out.println(expense[i]);
//		}
		//---------------------------------
		
		//-------- 마무리 출력 ------------
		System.out.println();
		System.out.println("- - - 각 층의 관리비 출력 - - - ");
		for(int i =0 ; i<FLOOR; i++) {
			System.out.println(">>" + (i+1)+ "층의 관리비는"+expense[i] + "원 입니다");
		}
		System.out.println();
		System.out.println("총 인원은" + people[FLOOR] + "명 입니다");
		System.out.println("총 관리비는" + expense[FLOOR] + "원 입니다");
		//---------------------------------

		
	}
	
}
