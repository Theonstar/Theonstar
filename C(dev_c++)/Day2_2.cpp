//2. 3���� ����(���� 0~6 �̳�)�� �Է¹޾� ���հ� ��� ���ϱ�(����� �Ҽ��� ��°�ڸ����� �ݿø� ���)

//��������(������ 4��, �Ǽ��� 1��)
//�Է��Լ�(���� 3�� �Է�)
//���� ���� ������ �Է¹��� ���� �հ� ����
//��� ���� ���� ���� / ����

#include <stdio.h>
int main(void){
  int num1, num2, num3, sum;
  float avg;

  scanf("%d %d %d", &num1, &num2, &num3);
  sum = num1 + num2 + num3;
  avg = (float)sum/3;

  printf("���� : %d\n", sum);
  printf("��� : %.01f\n", avg);
}
