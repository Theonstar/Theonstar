//2. 3개의 정수(각각 0~6 이내)를 입력받아 총합과 평균 구하기(평균은 소수점 둘째자리에서 반올림 출력)

//변수설정(정수형 4개, 실수형 1개)
//입력함수(정수 3개 입력)
//총점 구할 변수에 입력받은 값의 합계 대입
//평균 구할 변수 총점 / 개수

#include <stdio.h>
int main(void){
  int num1, num2, num3, sum;
  float avg;

  scanf("%d %d %d", &num1, &num2, &num3);
  sum = num1 + num2 + num3;
  avg = (float)sum/3;

  printf("총합 : %d\n", sum);
  printf("평균 : %.01f\n", avg);
}
