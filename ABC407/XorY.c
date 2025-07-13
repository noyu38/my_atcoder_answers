#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main(void) {
    int x, y;
    scanf("%d", &x);
    scanf("%d", &y);
    double count = 0;

    for (int a = 1; a <= 6; a++) {
        for (int b = 1; b <= 6; b++) {
            if (a + b >= x || abs(a - b) >= y) {
                count++;
            }
        }
    }

    printf("%.15f\n", count / 36.0);
}