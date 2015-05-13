#include<stdio.h> 

int main(int argc, char *argv[]) {
	printf("%s\n", "Variabledeclarationandinitialization");
	int a = 0;
	printf("%s%d\n", "ashouldbe0:a=", a);
	int b = 1;
	printf("%s%d\n", "bshouldbe1:b=", b);
	int c = 0;
	int d = 0;
	printf("%s%d%s%d\n", "c,dshouldbe0,0:c,d=", c, ",", d);
	int e = 5;
	int f = 5;
	printf("%s%d%s%d\n", "e,fshouldbe5,5:e,f=", e, ",", f);
	return 0;
}
