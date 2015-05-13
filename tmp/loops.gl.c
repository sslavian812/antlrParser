#include<stdio.h> 

int main(int argc, char *argv[]) {
	printf("%s\n", "lops");
	for (int i = 0; i < 10; ++i) {
		printf("%d\n", i);
	}
	for (int j = 1; j < 11; ++j) {
		int k = j-1;
		printf("%d\n", k);
	}
	int x = 1;
	while (x<10) {
		printf("%d\n", x);
		x = x+1;
	}
	while (x==10&x==10) {
		printf("%s\n", "end.x=10");
	}
	return 0;
}
