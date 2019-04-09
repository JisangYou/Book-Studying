#include <stdio.h>

void Recursive(int num)
{

	if (num <= 0)
		return;
	printf("Recursive call! %d \n", num);
	Recursive(num - 1);
}

int Factorial(int n)
{
	if (n == 0)
		return 1;
	else
		return n * Factorial(n - 1);
}

int Fibo(int n)
{
	if (n == 1)
		return 0;
	else if (n == 2)
		return 1;
	else
		return Fibo(n - 1) + Fibo(n - 2);
}

int BSearchRecur(int ar[], int first, int last, int target)
{
	int mid;
	if (first > last)
		return -1;
	mid = (first + last) / 2;

	if (ar[mid] == target)
		return mid;
	else if (target < ar[mid])
		return BSearchRecur(ar, first, mid - 1, target);
	else
		return BSearchRecur(ar, mid + 1, last, target);
}


int main(void)

{	//Recursive(3);

	//printf("1! = %d \n", Factorial(1));
	//printf("2! = %d \n", Factorial(2));
	//printf("3! = %d \n", Factorial(3));
	//printf("4! = %d \n", Factorial(4));
	//printf("9! = %d \n", Factorial(9));
	
	/*int i;
	for (i = 1; i < 15; i++)
		printf("%d ", Fibo(i));*/

	int arr[] = { 1,3,5,7,9 };
	int idx;

	idx = BSearchRecur(arr, 0, sizeof(arr) / sizeof(int) - 1, 7);
	if (idx == -1)
		printf("Ž�� ���� \n");
	else
		printf("Ÿ�� ���� �ε���: %d \n", idx);

	idx = BSearchRecur(arr, 0, sizeof(arr) / sizeof(int) - 1, 4);
	if (idx == -1)
		printf("Ž�� ���� \n");
	else
		printf("Ÿ�� ���� �ε���: %d \n", idx);

	return 0;
}

// ����Լ��� �ڷᱸ���� �˰����� ����� ������ �ܼ�ȭ �ϴµ� ���Ǵ� �߿��� �����̴�. 