#include <stdio.h>
#include <math.h>

int main(void) {
    double a, b;
    scanf("%lf", &a);
    scanf("%lf", &b);
    printf("%d\n", (int)round(a / b));
    return 0;
}