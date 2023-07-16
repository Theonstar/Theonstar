package day2;

public class Day_2_4 {


	public static void main(String[] args) {
		
		//1. 1부터 100까지의 정수 중 7의 배수의 총합을 출력하기
		
		int b = 0;
		
//		for (int i = 1; i <= 100; i++) {
//			if (i % 7 == 0) {
//				System.out.println(i);
//			}
//		}
		
		for (int i = 1; i <= 100; i++) {
			if(i % 7 == 0) {
				b += i;
				
			}
		}
		
		System.out.printf("1부터 100까지의 정수중 7의 배수의 총합은 %d", b);

	}

}
