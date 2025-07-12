#include <stdio.h>

int main(void) {
    int N;
    scanf("%d", &N);

    int A[N];
    long long tmpSum = 0;
    long long result = 0;
    for (int i = 0; i < N; i++) {
        scanf("%d", &A[i]);

        if (i >= 1) {
            tmpSum += A[i];
        }
    }

    for (int i = 0; i < N - 1; i++) {
        result += (long long)A[i] * tmpSum;
        tmpSum -= (long long)A[i + 1];
    }

    printf("%lld\n", result);
    return 0;
}