#include <stdio.h>

int main(void) {
    char buf[128];
    int N;
    fgets(buf, 127, stdin);
    sscanf(buf, "%d", &N);

    int A[N];

    for (int i = 0; i < N; i++) {
        scanf("%d", &A[i]);
    }

    int sum = 0;
    for (int i = 0; i < N; i += 2) {
        sum += A[i];
    }

    printf("%d\n", sum);
    return 0;
}