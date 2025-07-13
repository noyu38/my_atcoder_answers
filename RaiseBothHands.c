#include <stdio.h>

int main(void) {
    int l, r;
    scanf("%d", &l);
    scanf("%d", &r);

    if (l == 1 && r == 0) {
        printf("Yes");
    } else if (l == 0 && r == 1) {
        printf("No");
    } else {
        printf("Invalid");
    }

    return 0;
}