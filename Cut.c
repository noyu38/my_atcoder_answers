#include <stdio.h>

int main(void) {
    int n, k;
    scanf("%d", &n);
    scanf("%d", &k);
    int a[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    for (int i = n - k; i < n; i++) {
        if (i != n - k) {
            printf(" ");
        }
        printf("%d", a[i]);
    }
    for (int i = 0; i < n - k; i++) {
        printf(" %d", a[i]);
    }
    printf("\n");
    return 0;
}