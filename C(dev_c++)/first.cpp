#include <stdio.h>

int main() {
	// ���� 1  %c�� %s�� ���� �����ϰ� �ڵ� �ۼ� �� ��� ����ϱ�
	
	char s[10];
	char a;
	
	scnaf("%c", a); // ����"����"�Է� ���� �ƴ� "����"�� �Է� ;
	printf("%c", a);
	
	scnaf("%s", s);
	printf("%s", s);
	
	
};
