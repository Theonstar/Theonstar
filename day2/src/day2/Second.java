package day2;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		
		//2. 두 자리수 정수를 입력받고 십의 자리, 일의 자리를 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int first;
		
		int result = 0;
		int result2 = 0;
		
		System.out.printf("수를 입력하세요 : ");
		first = sc.nextInt();
		
		
		result = (first / 10);
		result2 = (first % 10);
		
		
		System.out.printf("십의 자리는 : %d\n",result);
		System.out.printf("일의 자리는 : %d", result2);
		
		
	}

}


// 선생님 풀이
//package class01;
//
//import java.util.Scanner;
//
//public class Ex1 {
//   public static void main(String[] args) {
//      //두 자리수 정수를 입력받고 십의 자리, 일의 자리 출력하기
//      
//      //1. 변수 설정(inputNum, resultNum1, resultNum2)
//      int inputNum = 0, resultNum1 = 0, resultNum2 = 0;
//      //2. 출력(두 자리수 정수 입력 : )
//      String msg = "두자리 수 정수 입력 : ";
//      //3. 입력받은 값을 변수에 저장
//      Scanner sc = new Scanner(System.in);
//      
//      System.out.println(msg);
//      inputNum = sc.nextInt();
//      //4. 계산하여 result 변수에 저장
//      resultNum1 = inputNum / 10;
//      resultNum2 = inputNum % 10;
//      
//      //5. 결과 출력
//      System.out.println("십의 자리 : " +resultNum1);
//      System.out.println("일의 자리 : " +resultNum2);
//      
//   }
//   
//   
//}
