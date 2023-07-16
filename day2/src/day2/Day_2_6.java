package day2;

import java.util.Scanner;



public class Day_2_6 {

	public static void main(String[] args) {
		
		//3. 숫자1개를 입력받고 양수이면 양수입니다, 음수이면 음수입니다, 0이면 0입니다를 출력하기
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요 : ");
		a = sc.nextInt();
		
		b = a % 2;
		
		if(a == 0) {
			System.out.println("0입니다");
		}
		else if(b != 0) {
			System.out.println("실수입니다");
		}
		else {
			System.out.println("정수입니다");
		}

	}

}
