package day2;

import java.util.Scanner;

public class Day_2_5 {

	public static void main(String[] args) {
	      //5. 입력받은 데이터로 c언어, 파이썬, java, 종료 기능을 번호로 선택해서 출력하기
	      
	      //제어문(while, switch)
	      //변수설정(2개)
	      boolean run = true;
	      
	      //입력 설정
	      Scanner sc = new Scanner(System.in);
	      
	      //반복문(While True)
	      while (run) {
	         System.out.println("1. c언어, 2. 파이썬, 3. java, 4. 종료");
	         System.out.print("선택 : ");
	         
	         //변수설정 선택한 번호 저장공간
	         int num = sc.nextInt();
	         
	         switch (num) {
	         case 1:
	            System.out.println("c언어 선택");
	            break;
	         case 2:
	            System.out.println("파이썬 선택");
	            break;
	         case 3:
	            System.out.println("java 선택");
	            break;
	         case 4:
	            System.out.println("종료 선택");
	            run = false;
	         }
	   
	      }
	}
}
