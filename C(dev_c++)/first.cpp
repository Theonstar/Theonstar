#include <stdio.h>

int main() {
	// 문제 1  %c와 %s의 차이 서술하고 코드 작성 후 결과 출력하기
	
	char s[10];
	char a;
	
	scnaf("%c", a); // 문자"형태"입력 열이 아닌 "문자"를 입력 ;
	printf("%c", a);
	
	scnaf("%s", s);
	printf("%s", s);
	
	
};
