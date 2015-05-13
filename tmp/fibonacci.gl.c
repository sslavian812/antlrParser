#include<stdio.h> 

int fib(int k)
{
	if (k==0) {
		return 0;
	}
	if (k==1) {
		return 1;
	}
	return fib(k-1)+fib(k-2);
}
int main(int argc, char *argv[]) {
	printf("%s\n", "n-thfibonaccinumber.putn:");
	int n = 0;
	scanf("%d", &n);
	printf("%d\n", fib(n));
	return 0;
}
