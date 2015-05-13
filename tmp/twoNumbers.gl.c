#include<stdio.h> 

int max(int a, int b)
{
	if (a>b) {
		return a;
	} else {
		return b;
	}
}
int min(int a, int b)
{
	if (a<b) {
		return a;
	} else {
		return b;
	}
}
int sum(int a, int b)
{
	return a+b;
}
int main(int argc, char *argv[]) {
	printf("%s\n", "putnumbers");
	int a = 0;
	int b = 0;
	scanf("%d%d", &a, &b);
	printf("%s%d\n", "max:", max(a,b));
	printf("%s%d\n", "min:", min(a,b));
	printf("%s%d\n", "sum:", sum(a,b));
	printf("%s%d\n", "average:", sum(a,b)/2);
	printf("%s%d%d\n", "beforeswap.a,b:", a, b);
	int a_248554682 = a;
	a = b;
	b = a_248554682;
	printf("%s%d%d\n", "afterswap.a,b:", a, b);
	printf("%s\n", "success!");
	return 0;
}
