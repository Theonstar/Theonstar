package day2;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// 1. 두 정수를 입력받고 합을 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		int first = 0;
		int second = 0;
		int result = 0;
		
		System.out.println("정수1 입력 : ");
		first = sc.nextInt();
		
		System.out.println("정수2 입력 : ");
		second = sc.nextInt();
		
		result = first + second;
		
		System.out.printf("두 정수의 합은 %d 입니다", result);
	}

}
