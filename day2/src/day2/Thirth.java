package day2;

public class Thirth {

	public static void main(String[] args) {
		//3. 자료형끼리 형변환 모두 출력하기 (문자열과 숫자, 정수와 실수)
		
		int it = 0;
		float a = 0;
		String b = "";
		
		b = "12345";
		it = Integer.valueOf(b);
		
		System.out.printf("믄지열 >> 숫자 /// %d\n", it);
		
		it = 12345;
		a = (char)(it);
		
		System.out.printf("숫자 >> 실수 /// %f", a);

	}

}
